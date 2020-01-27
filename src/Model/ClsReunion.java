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
public class ClsReunion implements Interface.IntUpdate
{
    private int id;
    private String designation,ordreJour,description;
    private Date dateReunion;

    public ClsReunion()
    {
        
    }

    public ClsReunion(int id, String designation, String ordreJour, String description, Date dateReunion) 
    {
        this.id = id;
        this.designation = designation;
        this.ordreJour = ordreJour;
        this.description = description;
        this.dateReunion = dateReunion;
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id) 
    {
        this.id = id;
    }

    public String getDesignation()
    {
        return designation;
    }

    public void setDesignation(String designation)
    {
        this.designation = designation;
    }

    public String getOrdreJour() 
    {
        return ordreJour;
    }

    public void setOrdreJour(String ordreJour)
    {
        this.ordreJour = ordreJour;
    }

    public String getDescription()
    {
        return description;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    public Date getDateReunion()
    {
        return dateReunion;
    }

    public void setDateReunion(Date dateReunion)
    {
        this.dateReunion = dateReunion;
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
