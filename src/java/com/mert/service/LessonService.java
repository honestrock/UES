/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mert.service;

import com.mert.ues.domains.TLesson;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author apple
 */
public interface LessonService {
    public ArrayList<TLesson> bringLessons();
    public ArrayList<TLesson> bringByType(String l_type);
}
