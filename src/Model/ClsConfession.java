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
public class ClsConfession implements Interface.IntUpdate
{
    private int id;
    private String designation;

    public ClsConfession(int id, String designation)
    {
        this.id = id;
        this.designation = designation;
    }

    public ClsConfession()
    {
        
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
