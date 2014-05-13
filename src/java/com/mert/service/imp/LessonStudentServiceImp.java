/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mert.service.imp;

import com.mert.service.LessonStudentService;
import com.mert.ues.domains.TLesson;
import com.mert.ues.domains.TLessonStudent;
import com.mert.ues.domains.TStudent;
import java.util.ArrayList;

/**
 *
 * @author apple
 */
public class LessonStudentServiceImp implements LessonStudentService{

    @Override
    public ArrayList<TLesson> studentLessons(int s_id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<TStudent> lessonsTaking(int l_id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<TLessonStudent> relTable() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
