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
public class ClsCommune implements Interface.IntUpdate
{
    private int id;
    private String designation;
    private ClsVille ville;

    public ClsCommune()
    {
        
    }

    public ClsCommune(int id, String designation, ClsVille ville)
    {
        this.id = id;
        this.designation = designation;
        this.ville = ville;
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

    public ClsVille getVille() 
    {
        return ville;
    }

    public void setVille(ClsVille ville)
    {
        this.ville = ville;
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
