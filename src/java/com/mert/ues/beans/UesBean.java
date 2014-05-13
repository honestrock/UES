/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mert.ues.beans;



import com.mert.service.MysqlConnection;
import com.mert.ues.domains.TUser;
import com.mert.ues.domains.TestDomain;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


/**
 *
 * @author apple
 */
public class UesBean {
    
    private TUser userinformation=new TUser();
    private PreparedStatement titlesQuery;
    private MysqlConnection m_con=new MysqlConnection();
   
    public UesBean(){
        
        userinformation.setMailUser("");
        userinformation.setNameUser("");
        userinformation.setSurnameUser("");
        userinformation.setTypeUser(1);
        m_con.connection();
    }
    
  
    public String login(){
        
        try{
            userinformation.setTypeUser(1);
            titlesQuery=m_con.connection().prepareStatement("select * from t_user where mail_user=? ");
            System.out.println(userinformation.getMailUser());
            System.out.println(userinformation.getPasswordUser());
            titlesQuery.setString(1, userinformation.getMailUser());
            ResultSet result=titlesQuery.executeQuery();
            
            while (result.next()) {
                System.out.println(result.getString("mail_user"));
                 System.out.println(result.getString("password_user"));
                if (result.getString("mail_user").equals(userinformation.getMailUser()) && result.getString("password_user").equals(userinformation.getPasswordUser())) {

                       
                        userinformation.setMailUser(result.getString("mail_user"));
                        userinformation.setTypeUser(result.getInt("type_user"));
                      
                }
                   return "admin";
            }
            
         
            return "login";
                    
        }catch(Exception ex){
                System.out.println("degerler yanlis");
             return "login";
        }
        
       
    }
    

    /**
     * @return the userinformation
     */
    public TUser getUserinformation() {
        return userinformation;
    }

    /**
     * @param userinformation the userinformation to set
     */
    public void setUserinformation(TUser userinformation) {
        this.userinformation = userinformation;
    }

    /**
     * @return the testDomain
     */
   
    
}
