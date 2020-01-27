/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Ven
 */
public class ClsAvenue implements Interface.IntUpdate
{
    private int id;
    private String designation;
    private ClsQuartier quartier;

    public ClsAvenue()
    {
        
    }

    public ClsAvenue(int id, String designation, ClsQuartier quartier)
    {
        this.id = id;
        this.designation = designation;
        this.quartier = quartier;
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

    public ClsQuartier getQuartier()
    {
        return quartier;
    }

    public void setQuartier(ClsQuartier quartier)
    {
        this.quartier = quartier;
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
