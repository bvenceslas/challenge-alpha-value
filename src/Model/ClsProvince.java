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
public class ClsProvince implements Interface.IntUpdate
{
    private int id;
    private String designation;
    private ClsPays pays;

    public ClsProvince()
    {
        
    }

    public ClsProvince(int id, String designation, ClsPays pays)
    {
        this.id = id;
        this.designation = designation;
        this.pays = pays;
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

    public ClsPays getPays() 
    {
        return pays;
    }

    public void setPays(ClsPays pays)
    {
        this.pays = pays;
    }

    @Override
    public boolean Update() throws Exception {
        return DAO.ClsUpdateAll.SaveInt(this);
    }

    @Override
    public boolean Delete() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
