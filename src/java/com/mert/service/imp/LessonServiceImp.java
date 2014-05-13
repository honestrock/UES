/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mert.service.imp;

import com.mert.service.LessonService;
import com.mert.service.MysqlConnection;
import com.mert.ues.domains.TLesson;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author apple
 */
public class LessonServiceImp implements LessonService{

    public MysqlConnection m_con;
    private PreparedStatement titlesQuery;
   ArrayList<TLesson> lesson_l;
    
    public LessonServiceImp() {
       m_con = new MysqlConnection(); 
    }

    @Override
    public ArrayList<TLesson> bringLessons() {
        lesson_l=new ArrayList<TLesson>();
        try {
           
               titlesQuery=m_con.connection().prepareStatement("select * from t_lesson");
               ResultSet result=titlesQuery.executeQuery();
               while(result.next()){
                   TLesson lesson=new TLesson();
                   lesson.setLessonName(result.getString("lesson_name"));
                   System.out.println(lesson.getLessonName());
                   lesson.setLessonType(result.getString("lesson_type"));
                   lesson.setLessonID(result.getInt("LessonID"));
                   lesson_l.add(lesson);
               }
               return lesson_l;
            
        } catch (Exception e) {
            
            return lesson_l;
        }
        
        
        
        
    }

    @Override
    public ArrayList<TLesson> bringByType(String l_type) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
   
}
