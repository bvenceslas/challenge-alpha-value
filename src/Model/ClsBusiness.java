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
public class ClsBusiness implements Interface.IntUpdate
{
    private int id;
    private String designation,lieu,detail;
    private ClsPerson person;

    public ClsBusiness()
    {
        
    }

    public ClsBusiness(int id, String designation, String lieu, String detail, ClsPerson person)
    {
        this.id = id;
        this.designation = designation;
        this.lieu = lieu;
        this.detail = detail;
        this.person = person;
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

    public String getLieu()
    {
        return lieu;
    }

    public void setLieu(String lieu)
    {
        this.lieu = lieu;
    }

    public String getDetail()
    {
        return detail;
    }

    public void setDetail(String detail)
    {
        this.detail = detail;
    }

    public ClsPerson getPerson()
    {
        return person;
    }

    public void setPerson(ClsPerson person)
    {
        this.person = person;
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
