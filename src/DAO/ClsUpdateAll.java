/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.ClsAvenue;
import Model.ClsBusiness;
import Model.ClsCommune;
import Model.ClsConfession;
import Model.ClsEglise;
import Model.ClsMail;
import Model.ClsParticipation;
import Model.ClsPays;
import Model.ClsPerson;
import Model.ClsProvince;
import Model.ClsQuartier;
import Model.ClsReunion;
import Model.ClsTelephone;
import Model.ClsUser;
import Model.ClsVille;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Ven
 */
public class ClsUpdateAll
{
    private static PreparedStatement pst=null;
    public static boolean SaveInt(Object obj) throws SQLException
    {
        
            if (obj instanceof  ClsPays)
            {
                ClsPays pa=(ClsPays)obj;
                pst=DbConnect.Connect().prepareCall("EXECUTE SP_InserttPays ?,?");
                pst.setInt(1, pa.getId());
                pst.setString(2, pa.getDesignation());
                pst.executeUpdate();
                DbConnect.Disconnect();
            return true;
            }
            else if (obj instanceof ClsProvince) 
            {
                ClsProvince prov=(ClsProvince)obj;
                pst=DbConnect.Connect().prepareCall("EXECUTE SP_InserttProvince ?,?,?");
                pst.setInt(1, prov.getId());
                pst.setString(2, prov.getDesignation());                
                pst.setString(3, prov.getPays().getDesignation());
                pst.executeUpdate();
                DbConnect.Disconnect();
                return true;
            }
            else if (obj instanceof ClsVille)
            {
                ClsVille vil=(ClsVille)obj;
                pst=DbConnect.Connect().prepareCall("EXECUTE SP_InserttVille ?,?,?");
                pst.setInt(1, vil.getId());
                pst.setString(2, vil.getDesignation());
                pst.setString(3, vil.getProvince().getDesignation());
                pst.executeUpdate();
                DbConnect.Disconnect();
                return true;
            }
            else if (obj instanceof ClsCommune) 
            {
                ClsCommune com=(ClsCommune)obj;
                pst=DbConnect.Connect().prepareCall("EXECUTE SP_InserttCommune ?,?,?");
                pst.setInt(1, com.getId());
                pst.setString(2, com.getDesignation());
                pst.setString(3, com.getVille().getDesignation());
                pst.executeUpdate();
                DbConnect.Disconnect();
                return true;
            }
            else if (obj instanceof ClsQuartier)
            {
                ClsQuartier quart=(ClsQuartier)obj;
                pst=DbConnect.Connect().prepareCall("EXECUTE SP_InserttQuartier ?,?,?");
                pst.setInt(1, quart.getId());
                pst.setString(2, quart.getDesignation());
                pst.setString(3, quart.getCommune().getDesignation());
                pst.executeUpdate();
                DbConnect.Disconnect();
                return true;
            }
            else if (obj instanceof ClsAvenue)
            {
                ClsAvenue av=(ClsAvenue)obj;
                pst=DbConnect.Connect().prepareCall("EXECUTE SP_InserttAvenue ?,?,?");
                pst.setInt(1, av.getId());
                pst.setString(2, av.getDesignation());
                pst.setString(3, av.getQuartier().getDesignation());
                pst.executeUpdate();
                DbConnect.Disconnect();
                return true;
            }
            else if (obj instanceof ClsConfession) 
            {
                ClsConfession conf=(ClsConfession)obj;
                pst=DbConnect.Connect().prepareCall("EXECUTE SP_InserttConfession ?,?");
                pst.setInt(1, conf.getId());
                pst.setString(2, conf.getDesignation());
                pst.executeUpdate();
                DbConnect.Disconnect();
                return true;
            }
            else if (obj instanceof ClsEglise)
            {
                ClsEglise eg=(ClsEglise)obj;
                pst=DbConnect.Connect().prepareCall("EXECUTE SP_InserttEglise ?,?,?");
                pst.setInt(1, eg.getId());
                pst.setString(2, eg.getDesignation());
                pst.setString(3, eg.getConfession().getDesignation());
                pst.executeUpdate();
                DbConnect.Disconnect();
                return true;
            }
            else if (obj instanceof ClsReunion) 
            {
                ClsReunion re=(ClsReunion)obj;
                pst=DbConnect.Connect().prepareCall("EXECUTE SP_InserttReunion ?,?,?,?,?");
                pst.setInt(1, re.getId());
                pst.setString(2, re.getDesignation());
                pst.setString(3, re.getOrdreJour());
                pst.setString(4, re.getDescription());
                pst.setDate(5, re.getDateReunion());
                pst.executeUpdate();
                DbConnect.Disconnect();
                return true;
            }
            else if (obj instanceof ClsPerson) 
            {
                ClsPerson pers=(ClsPerson)obj;
                pst=DbConnect.Connect().prepareCall("EXECUTE SP_InserttPerson ?,?,?,?,?,?,?,?,?,?,?,?,?");
                pst.setInt(1, pers.getId());
                pst.setString(2, pers.getNom());
                pst.setString(3, pers.getPostnom());
                pst.setString(4, pers.getPrenom());
                pst.setString(5, pers.getSexe());
                pst.setString(6, pers.getLieuNaiss());
                pst.setDate(7, pers.getDateNaiss());
                pst.setString(8, pers.getEtatCivil());
                pst.setString(9, pers.getProfession());
                pst.setString(10, pers.getPoste());
                pst.setString(11, pers.getEglise().getDesignation());
                pst.setString(12, pers.getAvenue().getDesignation());
                pst.setInt(13, pers.getNumeroAd());
                pst.executeUpdate();
                DbConnect.Disconnect();
                return true;
            }
            else if (obj instanceof ClsParticipation)
            {
                ClsParticipation part=(ClsParticipation)obj;
                pst=DbConnect.Connect().prepareCall("EXECUTE SP_InserttParticipation ?,?");
                pst.setString(1, part.getPerson().getNom());
                pst.setString(2, part.getReunion().getDesignation());
                pst.executeUpdate();
                DbConnect.Disconnect();
                return true;
            }
            else if (obj instanceof ClsTelephone)
            {
                ClsTelephone tel=(ClsTelephone)obj;
                pst=DbConnect.Connect().prepareCall("EXECUTE SP_InserttTelephone ?,?,?,?");
                pst.setInt(1, tel.getId());
                pst.setString(2, tel.getNumeroTelephone());
                pst.setString(3, tel.getTypeNumero());
                pst.setString(4, tel.getPerson().getNom());
                pst.executeUpdate();
                DbConnect.Disconnect();
                return true;
            }
            else if (obj instanceof ClsMail)
            {
                ClsMail ma=(ClsMail)obj;
                pst=DbConnect.Connect().prepareCall("EXECUTE SP_InserttMail ?,?,?,?");
                pst.setInt(1, ma.getId());
                pst.setString(2, ma.getAdresseMail());
                pst.setString(3, ma.getTypeAdresseMail());
                pst.setString(4, ma.getPerson().getNom());
                pst.executeUpdate();
                DbConnect.Disconnect();
                return true;
            }
            else if (obj instanceof ClsBusiness) 
            {
                ClsBusiness bus=(ClsBusiness)obj;
                pst=DbConnect.Connect().prepareCall("EXECUTE SP_InserttBusiness ?,?,?,?,?");
                pst.setInt(1, bus.getId());
                pst.setString(2, bus.getDesignation());
                pst.setString(3, bus.getLieu());
                pst.setString(4, bus.getDetail());
                pst.setString(5, bus.getPerson().getNom());
                pst.executeUpdate();
                DbConnect.Disconnect();
                return true;
            }
            else if (obj instanceof ClsUser)
            {
                ClsUser us =(ClsUser)obj;
                pst = DbConnect.Connect().prepareCall("EXECUTE SP_InserttUser ?,?,?,?,?");                
                pst.setInt(1, us.getId());
                pst.setString(2, us.getuName());
                pst.setString(3, us.getuPass());
                pst.setString(4, us.getuPriority());
                pst.setDate(5, us.getDateExpiration());
                pst.executeUpdate();
                DbConnect.Disconnect();
                return true;
            }
        return false;
    }
}
