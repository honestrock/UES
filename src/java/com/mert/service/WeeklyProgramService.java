/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mert.service;

import com.mert.ues.domains.TweekprogramLesson;
import java.util.ArrayList;

/**
 *
 * @author apple
 */
public interface WeeklyProgramService {
    public ArrayList<TweekprogramLesson> bringWeeklyLessonsID();
    public void clearWeeklyLessonsID();
    public void updateWeeklyLessons();
    public void updateWeeklyLessonByID(int l_id);
}
