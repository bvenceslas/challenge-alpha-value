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
public class ClsMail implements Interface.IntUpdate
{
    private int id;
    private String adresseMail,typeAdresseMail;
    private ClsPerson person;

    public ClsMail()
    {
        
    }

    public ClsMail(int id, String adresseMail, String typeAdresseMail, ClsPerson person)
    {
        this.id = id;
        this.adresseMail = adresseMail;
        this.typeAdresseMail = typeAdresseMail;
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

    public String getAdresseMail()
    {
        return adresseMail;
    }

    public void setAdresseMail(String adresseMail)
    {
        this.adresseMail = adresseMail;
    }

    public String getTypeAdresseMail()
    {
        return typeAdresseMail;
    }

    public void setTypeAdresseMail(String typeAdresseMail)
    {
        this.typeAdresseMail = typeAdresseMail;
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
