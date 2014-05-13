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
@Table(name = "t_student")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TStudent.findAll", query = "SELECT t FROM TStudent t"),
    @NamedQuery(name = "TStudent.findByStudentID", query = "SELECT t FROM TStudent t WHERE t.studentID = :studentID"),
    @NamedQuery(name = "TStudent.findByStudentName", query = "SELECT t FROM TStudent t WHERE t.studentName = :studentName"),
    @NamedQuery(name = "TStudent.findByStudentPart", query = "SELECT t FROM TStudent t WHERE t.studentPart = :studentPart")})
public class TStudent implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "StudentID")
    private Integer studentID;
    @Size(max = 45)
    @Column(name = "student_name")
    private String studentName;
    @Size(max = 45)
    @Column(name = "student_part")
    private String studentPart;

    public TStudent() {
    }

    public TStudent(Integer studentID) {
        this.studentID = studentID;
    }

    public Integer getStudentID() {
        return studentID;
    }

    public void setStudentID(Integer studentID) {
        this.studentID = studentID;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentPart() {
        return studentPart;
    }

    public void setStudentPart(String studentPart) {
        this.studentPart = studentPart;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (studentID != null ? studentID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TStudent)) {
            return false;
        }
        TStudent other = (TStudent) object;
        if ((this.studentID == null && other.studentID != null) || (this.studentID != null && !this.studentID.equals(other.studentID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mert.ues.domains.TStudent[ studentID=" + studentID + " ]";
    }
    
}
