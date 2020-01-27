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
public class ClsQuartier implements Interface.IntUpdate
{
    private int id;
    private String designation;
    private ClsCommune commune;

    public ClsQuartier()
    {
        
    }

    public ClsQuartier(int id, String designation, ClsCommune commune)
    {
        this.id = id;
        this.designation = designation;
        this.commune = commune;
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

    public ClsCommune getCommune()
    {
        return commune;
    }

    public void setCommune(ClsCommune commune)
    {
        this.commune = commune;
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
