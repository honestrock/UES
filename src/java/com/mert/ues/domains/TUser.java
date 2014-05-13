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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author apple
 */
@Entity
@Table(name = "t_user")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TUser.findAll", query = "SELECT t FROM TUser t"),
    @NamedQuery(name = "TUser.findByIdUser", query = "SELECT t FROM TUser t WHERE t.idUser = :idUser"),
    @NamedQuery(name = "TUser.findByNameUser", query = "SELECT t FROM TUser t WHERE t.nameUser = :nameUser"),
    @NamedQuery(name = "TUser.findBySurnameUser", query = "SELECT t FROM TUser t WHERE t.surnameUser = :surnameUser"),
    @NamedQuery(name = "TUser.findByTypeUser", query = "SELECT t FROM TUser t WHERE t.typeUser = :typeUser"),
    @NamedQuery(name = "TUser.findByMailUser", query = "SELECT t FROM TUser t WHERE t.mailUser = :mailUser"),
    @NamedQuery(name = "TUser.findByPasswordUser", query = "SELECT t FROM TUser t WHERE t.passwordUser = :passwordUser")})
public class TUser implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_user")
    private Integer idUser;
    @Basic(optional = false)
    @Column(name = "name_user")
    private String nameUser;
    @Basic(optional = false)
    @Column(name = "surname_user")
    private String surnameUser;
    @Basic(optional = false)
    @Column(name = "type_user")
    private int typeUser;
    @Basic(optional = false)
    @Column(name = "mail_user")
    private String mailUser;
    @Column(name = "password_user")
    private String passwordUser;

    public TUser() {
    }

    public TUser(Integer idUser) {
        this.idUser = idUser;
    }

    public TUser(Integer idUser, String nameUser, String surnameUser, int typeUser, String mailUser) {
        this.idUser = idUser;
        this.nameUser = nameUser;
        this.surnameUser = surnameUser;
        this.typeUser = typeUser;
        this.mailUser = mailUser;
    }

    public Integer getIdUser() {
        return idUser;
    }

    public void setIdUser(Integer idUser) {
        this.idUser = idUser;
    }

    public String getNameUser() {
        return nameUser;
    }

    public void setNameUser(String nameUser) {
        this.nameUser = nameUser;
    }

    public String getSurnameUser() {
        return surnameUser;
    }

    public void setSurnameUser(String surnameUser) {
        this.surnameUser = surnameUser;
    }

    public int getTypeUser() {
        return typeUser;
    }

    public void setTypeUser(int typeUser) {
        this.typeUser = typeUser;
    }

    public String getMailUser() {
        return mailUser;
    }

    public void setMailUser(String mailUser) {
        this.mailUser = mailUser;
    }

    public String getPasswordUser() {
        return passwordUser;
    }

    public void setPasswordUser(String passwordUser) {
        this.passwordUser = passwordUser;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idUser != null ? idUser.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TUser)) {
            return false;
        }
        TUser other = (TUser) object;
        if ((this.idUser == null && other.idUser != null) || (this.idUser != null && !this.idUser.equals(other.idUser))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mert.ues.domains.TUser[ idUser=" + idUser + " ]";
    }
    
}
