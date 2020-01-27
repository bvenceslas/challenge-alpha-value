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
public class ClsVille implements Interface.IntUpdate
{
    private int id;
    private String designation;
    private ClsProvince province;

    public ClsVille()
    {
        
    }
    public ClsVille(int id, String designation, ClsProvince province) 
    {
        this.id = id;
        this.designation = designation;
        this.province = province;
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
    public ClsProvince getProvince()
    {
        return province;
    }
    public void setProvince(ClsProvince province)
    {
        this.province = province;
    }
    @Override
    public boolean Update() throws Exception
    {
        return DAO.ClsUpdateAll.SaveInt(this);
    }
    @Override
    public boolean Delete() throws Exception 
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }  
    
}
