/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author Ven
 */
public class DbConnect 
{
    private static Connection con;
    public static Connection Connect()
    {
        try 
        {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            return con=DriverManager.getConnection("jdbc:sqlserver://VEN\\VENSERVER; databaseName=db_CbmcDrc; user=sa; password=ven");
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, "Une Erreur De connection\n "
            + "à la base des donnée a été trouvée"+e.getMessage(), "Database Connection Error / DbCon", JOptionPane.ERROR_MESSAGE);
        }
        return null;
    }
    
    public static void Disconnect()
    {
        try 
        {
            if (con!=null)
            {
                con.close();
            }
        } 
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, "Une Erreur De deconnection\n "
            + "à la base des donnée a été trouvée"+e.getMessage(), "Database DisConnection Error / DbCon", JOptionPane.ERROR_MESSAGE);
        }
    }
}
