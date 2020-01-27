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
public class ClsEglise implements Interface.IntUpdate
{
    private int id;
    private String designation;
    private ClsConfession confession;

    public ClsEglise()
    {
        
    }

    public ClsEglise(int id, String designation, ClsConfession confession)
    {
        this.id = id;
        this.designation = designation;
        this.confession = confession;
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

    public ClsConfession getConfession()
    {
        return confession;
    }

    public void setConfession(ClsConfession confession)
    {
        this.confession = confession;
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
