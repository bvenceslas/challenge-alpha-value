/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.Date;

/**
 *
 * @author Ven
 */
public class ClsUser implements Interface.IntUpdate
{
    private int id;
    String uName,uPass,uPriority;
    Date dateExpiration;

    public ClsUser()
    {
    }

    public ClsUser(int id, String uName, String uPass, String uPriority, Date dateExpiration) {
        this.id = id;
        this.uName = uName;
        this.uPass = uPass;
        this.uPriority = uPriority;
        this.dateExpiration = dateExpiration;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getuName() {
        return uName;
    }

    public void setuName(String uName) {
        this.uName = uName;
    }

    public String getuPass() {
        return uPass;
    }

    public void setuPass(String uPass) {
        this.uPass = uPass;
    }

    public String getuPriority() {
        return uPriority;
    }

    public void setuPriority(String uPriority) {
        this.uPriority = uPriority;
    }

    public Date getDateExpiration() {
        return dateExpiration;
    }

    public void setDateExpiration(Date dateExpiration) {
        this.dateExpiration = dateExpiration;
    }

    @Override
    public boolean Update() throws Exception 
    {
        return DAO.ClsUpdateAll.SaveInt(this);
    }

    @Override
    public boolean Delete() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
