/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mert.ues.beans;

import com.mert.service.MysqlConnection;
import com.mert.ues.domains.TAdvert;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author apple
 */

public class DuyuruListeleme {

    private  PreparedStatement pr;
    public MysqlConnection baglanti;
    public DuyuruListeleme() {
        baglanti=new MysqlConnection();
    }
    
    public  ArrayList<TAdvert> duyuruGetir() {
        ArrayList<TAdvert> liste = new ArrayList<TAdvert>();
        try {
            pr = baglanti.connection().prepareStatement("select * from t_advert where userAuth=? and  confirm=?");
            pr.setInt(1, 1);
            pr.setInt(2, 1);
             ResultSet results = pr.executeQuery();
             while (results.next()) {
                TAdvert ad= new TAdvert();
                ad.setAdvertCont(results.getString("advertCont"));
                ad.setAdvertTitle(results.getString("advertTitle"));
                ad.setConfirm(results.getInt("confirm"));
                ad.setImageUrl(results.getString("imageUrl"));
                ad.setUserAuth(results.getInt("userAuth"));
               
                liste.add(ad);
            }
            return liste;
        } catch (Exception e) {
            return liste;
        }

    }
}
