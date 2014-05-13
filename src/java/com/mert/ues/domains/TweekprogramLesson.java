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
@Table(name = "t_week_program_Lesson")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TweekprogramLesson.findAll", query = "SELECT t FROM TweekprogramLesson t"),
    @NamedQuery(name = "TweekprogramLesson.findByWeekProgramID", query = "SELECT t FROM TweekprogramLesson t WHERE t.weekProgramID = :weekProgramID"),
    @NamedQuery(name = "TweekprogramLesson.findByLessonID", query = "SELECT t FROM TweekprogramLesson t WHERE t.lessonID = :lessonID")})
public class TweekprogramLesson implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "WeekProgramID")
    private Integer weekProgramID;
    @Column(name = "LessonID")
    private Integer lessonID;

    public TweekprogramLesson() {
    }

    public TweekprogramLesson(Integer weekProgramID) {
        this.weekProgramID = weekProgramID;
    }

    public Integer getWeekProgramID() {
        return weekProgramID;
    }

    public void setWeekProgramID(Integer weekProgramID) {
        this.weekProgramID = weekProgramID;
    }

    public Integer getLessonID() {
        return lessonID;
    }

    public void setLessonID(Integer lessonID) {
        this.lessonID = lessonID;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (weekProgramID != null ? weekProgramID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TweekprogramLesson)) {
            return false;
        }
        TweekprogramLesson other = (TweekprogramLesson) object;
        if ((this.weekProgramID == null && other.weekProgramID != null) || (this.weekProgramID != null && !this.weekProgramID.equals(other.weekProgramID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mert.ues.domains.TweekprogramLesson[ weekProgramID=" + weekProgramID + " ]";
    }
    
}
