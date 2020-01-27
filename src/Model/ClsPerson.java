/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.Date;

/**
 *
 * @author Ven
 */
public class ClsPerson implements Interface.IntUpdate 
{
    private int id,numeroAd;
    private String nom,postnom,prenom,sexe,lieuNaiss,etatCivil,profession,poste;
    private Date dateNaiss;
    private ClsEglise eglise;
    private ClsAvenue avenue;

    public ClsPerson()
    {
        
    }

    public ClsPerson
        (int id, String nom, String postnom, String prenom, String sexe,
        String lieuNaiss, Date dateNaiss, String etatCivil, String profession,
        String poste, ClsEglise eglise, ClsAvenue avenue, int numeroAd
        ) 
    {
        this.id = id;
        this.numeroAd=numeroAd;
        this.nom = nom;
        this.postnom = postnom;
        this.prenom = prenom;
        this.sexe = sexe;
        this.lieuNaiss = lieuNaiss;
        this.etatCivil = etatCivil;
        this.profession = profession;
        this.poste = poste;
        this.dateNaiss = dateNaiss;
        this.eglise = eglise;
        this.avenue = avenue;
    }

    public int getNumeroAd()
    {
        return numeroAd;
    }

    public void setNumeroAd(int numeroAd)
    {
        this.numeroAd = numeroAd;
    }

    public int getId() 
    {
        return id;
    }

    public void setId(int id) 
    {
        this.id = id;
    }

    public String getNom()
    {
        return nom;
    }

    public void setNom(String nom)
    {
        this.nom = nom;
    }

    public String getPostnom()
    {
        return postnom;
    }

    public void setPostnom(String postnom)
    {
        this.postnom = postnom;
    }

    public String getPrenom()
    {
        return prenom;
    }

    public void setPrenom(String prenom)
    {
        this.prenom = prenom;
    }

    public String getSexe()
    {
        return sexe;
    }

    public void setSexe(String sexe)
    {
        this.sexe = sexe;
    }

    public String getLieuNaiss()
    {
        return lieuNaiss;
    }

    public void setLieuNaiss(String lieuNaiss)
    {
        this.lieuNaiss = lieuNaiss;
    }

    public String getEtatCivil()
    {
        return etatCivil;
    }

    public void setEtatCivil(String etatCivil)
    {
        this.etatCivil = etatCivil;
    }
    
    public String getProfession()
    {
        return profession;
    }

    public void setProfession(String profession)
    {
        this.profession = profession;
    }

    public String getPoste()
    {
        return poste;
    }

    public void setPoste(String poste)
    {
        this.poste = poste;
    }

    public Date getDateNaiss()
    {
        return dateNaiss;
    }

    public void setDateNaiss(Date dateNaiss)
    {
        this.dateNaiss = dateNaiss;
    }

    public ClsEglise getEglise()
    {
        return eglise;
    }

    public void setEglise(ClsEglise eglise)
    {
        this.eglise = eglise;
    }

    public ClsAvenue getAvenue()
    {
        return avenue;
    }

    public void setAvenue(ClsAvenue avenue)
    {
        this.avenue = avenue;
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
