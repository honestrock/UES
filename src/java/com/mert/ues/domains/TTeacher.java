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
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author apple
 */
@Entity
@Table(name = "t_teacher")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TTeacher.findAll", query = "SELECT t FROM TTeacher t"),
    @NamedQuery(name = "TTeacher.findByTeacherID", query = "SELECT t FROM TTeacher t WHERE t.teacherID = :teacherID"),
    @NamedQuery(name = "TTeacher.findByTeacherName", query = "SELECT t FROM TTeacher t WHERE t.teacherName = :teacherName"),
    @NamedQuery(name = "TTeacher.findByTeacherDepartmant", query = "SELECT t FROM TTeacher t WHERE t.teacherDepartmant = :teacherDepartmant")})
public class TTeacher implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "TeacherID")
    private Integer teacherID;
    @Size(max = 45)
    @Column(name = "teacher_name")
    private String teacherName;
    @Size(max = 45)
    @Column(name = "teacher_departmant")
    private String teacherDepartmant;

    public TTeacher() {
    }

    public TTeacher(Integer teacherID) {
        this.teacherID = teacherID;
    }

    public Integer getTeacherID() {
        return teacherID;
    }

    public void setTeacherID(Integer teacherID) {
        this.teacherID = teacherID;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public String getTeacherDepartmant() {
        return teacherDepartmant;
    }

    public void setTeacherDepartmant(String teacherDepartmant) {
        this.teacherDepartmant = teacherDepartmant;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (teacherID != null ? teacherID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TTeacher)) {
            return false;
        }
        TTeacher other = (TTeacher) object;
        if ((this.teacherID == null && other.teacherID != null) || (this.teacherID != null && !this.teacherID.equals(other.teacherID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mert.ues.domains.TTeacher[ teacherID=" + teacherID + " ]";
    }
    
}
