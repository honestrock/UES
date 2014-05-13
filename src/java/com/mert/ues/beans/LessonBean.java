/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mert.ues.beans;

import com.mert.service.imp.LessonServiceImp;
import com.mert.ues.domains.TLesson;
import java.util.ArrayList;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

import javax.swing.tree.DefaultMutableTreeNode;
import org.primefaces.model.TreeNode;
import org.primefaces.event.NodeCollapseEvent;
import org.primefaces.event.NodeExpandEvent;
import org.primefaces.event.NodeSelectEvent;
import org.primefaces.event.NodeUnselectEvent;
import org.primefaces.model.DefaultTreeNode;
 




public class LessonBean {
    
    private TreeNode root;
 
    private TreeNode selectedNode;

    LessonServiceImp l_imp=new LessonServiceImp();
    private ArrayList<TLesson> l_list;
    private ArrayList<TLesson> l_list2;
    public LessonBean() {
         
 nodeCreater();
 
       
        
     
        
    }
    
    public ArrayList<TLesson> listeDonder(){
        return  l_list=l_imp.bringLessons();
    }
    
    public void nodeCreater(){
        root = new DefaultTreeNode("Root", null);
        l_list2=l_imp.bringLessons();
        
        for(TLesson t: l_list2){
            TreeNode node0 = new DefaultTreeNode(t.getLessonName(), root);
            for(TLesson t2:l_list2){
                 TreeNode node00 = new DefaultTreeNode(t2.getLessonType(), node0);
            }
            
        }
        
        
    }

    /**
     * @return the l_list
     */
    public ArrayList<TLesson> getL_list() {
        return l_list;
    }

    /**
     * @param l_list the l_list to set
     */
    public void setL_list(ArrayList<TLesson> l_list) {
        this.l_list = l_list;
    }

    /**
     * @return the root
     */
    public TreeNode getRoot() {
        return root;
    }

    /**
     * @param root the root to set
     */
    public void setRoot(TreeNode root) {
        this.root = root;
    }

    /**
     * @return the selectedNode
     */
    public TreeNode getSelectedNode() {
        return selectedNode;
    }

    /**
     * @param selectedNode the selectedNode to set
     */
    public void setSelectedNode(TreeNode selectedNode) {
        this.selectedNode = selectedNode;
    }

    
     public void onNodeExpand(NodeExpandEvent event) {
        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, "Expanded", event.getTreeNode().toString());
 
        FacesContext.getCurrentInstance().addMessage(null, message);
    }
 
    public void onNodeCollapse(NodeCollapseEvent event) {
        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, "Collapsed", event.getTreeNode().toString());
 
        FacesContext.getCurrentInstance().addMessage(null, message);
    }
 
    public void onNodeSelect(NodeSelectEvent event) {
        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, "Selected", event.getTreeNode().toString());
 
        FacesContext.getCurrentInstance().addMessage(null, message);
    }
 
    public void onNodeUnselect(NodeUnselectEvent event) {
        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, "Unselected", event.getTreeNode().toString());
 
        FacesContext.getCurrentInstance().addMessage(null, message);
    }
    
    
    /**
     * @return the root
     */


    /**
     * @param root the root to set
     */

    /**
     * @return the selectedNodes

    /**
     * @return the l_list
     */
    
    
}
