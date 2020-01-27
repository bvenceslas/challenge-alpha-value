/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Ven
 */
public class ClsDeleteAll
{
    private PreparedStatement pst=null;
    public void DeleteIn(String table, int idTable) throws SQLException
    {
        pst=DbConnect.Connect().prepareStatement("DELETE FROM "+table+" WHERE id= ?");
        pst.setInt(1, idTable);
        pst.executeUpdate();
        DbConnect.Disconnect();        
    }
}
