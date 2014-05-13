/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mert.service;

import com.mert.ues.domains.TLesson;
import com.mert.ues.domains.TTeacher;
import java.util.ArrayList;

/**
 *
 * @author apple
 */
public interface TeacherService {
      public ArrayList<TTeacher> bringTeahcers();
      public TTeacher bringTeacherById(int t_id);
      public void updateTeacherById(int t_id);
}
