/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mert.ues.beans;

import com.mert.service.MysqlConnection;
import com.mert.ues.domains.TAdvert;
import java.sql.Date;
import java.sql.PreparedStatement;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;

/**
 *
 * @author apple
 */

public class DuyuruBean {

    /**
     * Creates a new instance of DuyuruBean
     */
    
    
    public MysqlConnection baglanti = new MysqlConnection();
    private PreparedStatement pr;
    private TAdvert advrt;
    private String yazar;

    FacesContext context;

    
    
    public DuyuruBean() {
        
          advrt = new TAdvert();
        baglanti.connection();
        advrt.setAdvertCont("");
       // advrt.setAdvertDate(new Date(new java.util.Date().getYear(), new java.util.Date().getMonth(), new java.util.Date().getDay()));
       // advrt.setAdvertDate(new Date(new java.util.Date().getYear(), new java.util.Date().getMonth(), new java.util.Date().getDay()));
        advrt.setAdvertTitle("");
        advrt.setConfirm(0);
        advrt.setImageUrl("");
        advrt.setUserAuth(2);
        context = FacesContext.getCurrentInstance();
        
    }
    
    
    public String duyuruKaydet(ActionEvent actionEvent) {

        if (getAdvrt().getAdvertTitle().equals("") || getAdvrt().getAdvertCont().equals("")) {
            context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Lütfen Boş bırakmayınız", "Duyuru Başlığı ve İçeriği Boş Bırakılamaz"));
            return null;

        } else {
            if (getYazar().equals("Yazarlar")) {
                if (!advrt.getImageUrl().equals("")) {
                    getAdvrt().setUserAuth(1);
                    return kayit();
                } else {
                    getAdvrt().setImageUrl("yok");
                    getAdvrt().setUserAuth(1);
                    return kayit();

                }
            } else {
                if (!advrt.getImageUrl().equals("")) {
                    getAdvrt().setUserAuth(2);
                    return kayit();

                } else {
                    getAdvrt().setImageUrl("yok");
                    getAdvrt().setUserAuth(2);
                    return kayit();

                }

            }
        }

    }

    public String kayit() {
        try {
            getAdvrt().setConfirm(0);
            pr = baglanti.connection().prepareStatement("insert into UES.t_advert (advertCont,advertTitle,confirm,imageUrl,userAuth)  values(?,?,?,?,?)");
            pr.setString(1, getAdvrt().getAdvertCont());
            pr.setString(2, getAdvrt().getAdvertTitle());
            pr.setInt(3, getAdvrt().getConfirm());
            pr.setString(4, getAdvrt().getImageUrl());
            pr.setInt(5, getAdvrt().getUserAuth());

            pr.execute();
            context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Duyuru Kaydı Başarılı", "Duyuru Onayı Bölümünden Yayınlayabilirsiniz"));
            return null;
        } catch (Exception e) {
            context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Böyle Bir Makale Kayıtlı Olabilir!", "Lütfen Sistemde Bulunmayan makaleler Yayınlamaya Özen Gösteriniz"));
            return null;
        }

    }

    /**
     * @return the advrt
     */
    public TAdvert getAdvrt() {
        return advrt;
    }

    /**
     * @param advrt the advrt to set
     */
    public void setAdvrt(TAdvert advrt) {
        this.advrt = advrt;
    }

    /**
     * @return the yazar
     */
    public String getYazar() {
        return yazar;
    }

    /**
     * @param yazar the yazar to set
     */
    public void setYazar(String yazar) {
        this.yazar = yazar;
    }

    
    
    
}
