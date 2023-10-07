/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.battleshipgame;

/**
 *
 * @author sujiitramurukeshan
 */
public class Human extends Player{
     private String name;
        public int level;
        ListObjects listobj=new ListObjects();
        public void addName(String name){
            this.name=name;
            listobj.listObj(name);
            
        }
        public void removeName(String name){
            
        }
    
}
