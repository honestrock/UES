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
@Table(name = "t_lesson")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TLesson.findAll", query = "SELECT t FROM TLesson t"),
    @NamedQuery(name = "TLesson.findByLessonID", query = "SELECT t FROM TLesson t WHERE t.lessonID = :lessonID"),
    @NamedQuery(name = "TLesson.findByLessonName", query = "SELECT t FROM TLesson t WHERE t.lessonName = :lessonName"),
    @NamedQuery(name = "TLesson.findByLessonType", query = "SELECT t FROM TLesson t WHERE t.lessonType = :lessonType"),
    @NamedQuery(name = "TLesson.findByLessonLength", query = "SELECT t FROM TLesson t WHERE t.lessonLength = :lessonLength")})
public class TLesson implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "LessonID")
    private Integer lessonID;
    @Size(max = 45)
    @Column(name = "lesson_name")
    private String lessonName;
    @Size(max = 45)
    @Column(name = "lesson_type")
    private String lessonType;
    @Size(max = 45)
    @Column(name = "lesson_length")
    private String lessonLength;

    public TLesson() {
    }

    public TLesson(Integer lessonID) {
        this.lessonID = lessonID;
    }

    public Integer getLessonID() {
        return lessonID;
    }

    public void setLessonID(Integer lessonID) {
        this.lessonID = lessonID;
    }

    public String getLessonName() {
        return lessonName;
    }

    public void setLessonName(String lessonName) {
        this.lessonName = lessonName;
    }

    public String getLessonType() {
        return lessonType;
    }

    public void setLessonType(String lessonType) {
        this.lessonType = lessonType;
    }

    public String getLessonLength() {
        return lessonLength;
    }

    public void setLessonLength(String lessonLength) {
        this.lessonLength = lessonLength;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (lessonID != null ? lessonID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TLesson)) {
            return false;
        }
        TLesson other = (TLesson) object;
        if ((this.lessonID == null && other.lessonID != null) || (this.lessonID != null && !this.lessonID.equals(other.lessonID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mert.ues.domains.TLesson[ lessonID=" + lessonID + " ]";
    }
    
}
