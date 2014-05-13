/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mert.service;

import com.mert.ues.domains.TLesson;
import com.mert.ues.domains.TLessonStudent;
import com.mert.ues.domains.TStudent;
import java.util.ArrayList;

/**
 *
 * @author apple
 */
public interface LessonStudentService {
    public ArrayList<TLesson> studentLessons(int s_id);
    public ArrayList<TStudent> lessonsTaking(int l_id);
    public ArrayList<TLessonStudent> relTable();
}
