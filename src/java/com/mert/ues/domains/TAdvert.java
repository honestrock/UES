/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mert.ues.domains;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author apple
 */
@Entity
@Table(name = "t_advert")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TAdvert.findAll", query = "SELECT t FROM TAdvert t"),
    @NamedQuery(name = "TAdvert.findByAdid", query = "SELECT t FROM TAdvert t WHERE t.adid = :adid"),
    @NamedQuery(name = "TAdvert.findByConfirm", query = "SELECT t FROM TAdvert t WHERE t.confirm = :confirm"),
    @NamedQuery(name = "TAdvert.findByImageUrl", query = "SELECT t FROM TAdvert t WHERE t.imageUrl = :imageUrl"),
    @NamedQuery(name = "TAdvert.findByUserAuth", query = "SELECT t FROM TAdvert t WHERE t.userAuth = :userAuth"),
    @NamedQuery(name = "TAdvert.findByAdvertDate", query = "SELECT t FROM TAdvert t WHERE t.advertDate = :advertDate")})
public class TAdvert implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "adid")
    private Integer adid;
    @Lob
    @Column(name = "advertCont")
    private String advertCont;
    @Lob
    @Column(name = "advertTitle")
    private String advertTitle;
    @Column(name = "confirm")
    private Integer confirm;
    @Column(name = "imageUrl")
    private String imageUrl;
    @Column(name = "userAuth")
    private Integer userAuth;
    @Column(name = "advertDate")
    private String advertDate;

    public TAdvert() {
    }

    public TAdvert(Integer adid) {
        this.adid = adid;
    }

    public Integer getAdid() {
        return adid;
    }

    public void setAdid(Integer adid) {
        this.adid = adid;
    }

    public String getAdvertCont() {
        return advertCont;
    }

    public void setAdvertCont(String advertCont) {
        this.advertCont = advertCont;
    }

    public String getAdvertTitle() {
        return advertTitle;
    }

    public void setAdvertTitle(String advertTitle) {
        this.advertTitle = advertTitle;
    }

    public Integer getConfirm() {
        return confirm;
    }

    public void setConfirm(Integer confirm) {
        this.confirm = confirm;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public Integer getUserAuth() {
        return userAuth;
    }

    public void setUserAuth(Integer userAuth) {
        this.userAuth = userAuth;
    }

    public String getAdvertDate() {
        return advertDate;
    }

    public void setAdvertDate(String advertDate) {
        this.advertDate = advertDate;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (adid != null ? adid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TAdvert)) {
            return false;
        }
        TAdvert other = (TAdvert) object;
        if ((this.adid == null && other.adid != null) || (this.adid != null && !this.adid.equals(other.adid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mert.ues.domains.TAdvert[ adid=" + adid + " ]";
    }
    
}
