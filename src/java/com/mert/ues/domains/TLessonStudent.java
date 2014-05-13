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
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author apple
 */
@Entity
@Table(name = "t_lesson_student")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TLessonStudent.findAll", query = "SELECT t FROM TLessonStudent t"),
    @NamedQuery(name = "TLessonStudent.findByLessonStudentID", query = "SELECT t FROM TLessonStudent t WHERE t.lessonStudentID = :lessonStudentID"),
    @NamedQuery(name = "TLessonStudent.findByStudentId", query = "SELECT t FROM TLessonStudent t WHERE t.studentId = :studentId"),
    @NamedQuery(name = "TLessonStudent.findByLesssonId", query = "SELECT t FROM TLessonStudent t WHERE t.lesssonId = :lesssonId")})
public class TLessonStudent implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "LessonStudentID")
    private Integer lessonStudentID;
    @Column(name = "student_id")
    private Integer studentId;
    @Column(name = "lessson_id")
    private Integer lesssonId;

    public TLessonStudent() {
    }

    public TLessonStudent(Integer lessonStudentID) {
        this.lessonStudentID = lessonStudentID;
    }

    public Integer getLessonStudentID() {
        return lessonStudentID;
    }

    public void setLessonStudentID(Integer lessonStudentID) {
        this.lessonStudentID = lessonStudentID;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public Integer getLesssonId() {
        return lesssonId;
    }

    public void setLesssonId(Integer lesssonId) {
        this.lesssonId = lesssonId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (lessonStudentID != null ? lessonStudentID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TLessonStudent)) {
            return false;
        }
        TLessonStudent other = (TLessonStudent) object;
        if ((this.lessonStudentID == null && other.lessonStudentID != null) || (this.lessonStudentID != null && !this.lessonStudentID.equals(other.lessonStudentID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mert.ues.domains.TLessonStudent[ lessonStudentID=" + lessonStudentID + " ]";
    }
    
}
