/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Ven
 */
public class Fill_Object
{

    private static PreparedStatement pst = null;
    private static ResultSet rs = null;
    private static DefaultTableModel dtm;
    //fonction pour charger les data dans un tableau
    public static void remplir_tableau(JTable table, String Querry) throws SQLException
    {        
        dtm = new DefaultTableModel();
        pst = DbConnect.Connect().prepareStatement(Querry);
        rs = pst.executeQuery();
        //savoir combien de colonnes a notre querry
        for (int i = 0; i < rs.getMetaData().getColumnCount(); i++) 
        {
            dtm.addColumn(rs.getMetaData().getColumnName(i + 1).toUpperCase());
            //toUpperCase transforme les nom en majuscule
        }
        table.setModel(dtm);
        dtm.setRowCount(0);
        while (rs.next()) {
            ObservableList<Object> liste = FXCollections.observableArrayList();
            for (int i = 1; i < rs.getMetaData().getColumnCount() + 1; i++) 
            {
                //ObservableList commence a zero tandis que ResultSet commence a 1
                //ObservableList+1 pour egaler avec le ResultSet
                liste.add(rs.getObject(i));

            }
            dtm.addRow(liste.toArray());
        }
        table.setModel(dtm);        
    }
    
    //fonction pour charger les comboBox
    public static void charger_ComboBox(JComboBox comboBox,String Requette) throws SQLException
    {        
        comboBox.removeAllItems();
        pst = DbConnect.Connect().prepareStatement(Requette);
        rs = pst.executeQuery();    
        while (rs.next())
        { 
            comboBox.addItem(rs.getObject(1));                
        }        
    }
    
    public static void remplir_formulaire(JTable table,Object obj[]) throws Exception
    {        
        if (table.getSelectedRow()>=0)
        {
            for(int m=0;m<table.getColumnCount();m++)
            {
                obj[m]=table.getValueAt(table.getSelectedRow(), m).toString();
            }
        }        
    }
    
    public static int incerementeur(String table) throws SQLException
    {        
        pst = DbConnect.Connect().prepareStatement("SELECT COALESCE(MAX(id),0) FROM "+table+"");
        rs = pst.executeQuery();
        while (rs.next())
        {
            return (rs.getInt(1)+1);
        }        
        return 0;
    }   
}