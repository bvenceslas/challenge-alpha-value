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
public class ClsTelephone implements Interface.IntUpdate
{
    private int id;
    private String numeroTelephone,typeNumero;
    private ClsPerson person;

    public ClsTelephone()
    {
        
    }

    public ClsTelephone(int id, String numeroTelephone, String typeNumero, ClsPerson person) 
    {
        this.id = id;
        this.numeroTelephone = numeroTelephone;
        this.typeNumero = typeNumero;
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

    public String getNumeroTelephone()
    {
        return numeroTelephone;
    }

    public void setNumeroTelephone(String numeroTelephone) 
    {
        this.numeroTelephone = numeroTelephone;
    }

    public String getTypeNumero()
    {
        return typeNumero;
    }

    public void setTypeNumero(String typeNumero)
    {
        this.typeNumero = typeNumero;
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
