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
public class ClsParticipation implements Interface.IntUpdate
{
    private ClsPerson person;
    private ClsReunion reunion;

    public ClsParticipation()
    {
        
    }

    public ClsParticipation(ClsPerson person, ClsReunion reunion)
    {
        this.person = person;
        this.reunion = reunion;
    }

    public ClsPerson getPerson()
    {
        return person;
    }

    public void setPerson(ClsPerson person) 
    {
        this.person = person;
    }

    public ClsReunion getReunion()
    {
        return reunion;
    }

    public void setReunion(ClsReunion reunion)
    {
        this.reunion = reunion;
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
