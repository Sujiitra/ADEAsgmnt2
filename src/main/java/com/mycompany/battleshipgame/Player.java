/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.battleshipgame;

/**
 *
 * @author sujiitramurukeshan
 */
public class Player {
    
        public int id;
        public int point;
        public int mul=1;
        ListObjects listobj=new ListObjects();
        public void addShip(){
        }
        public void removeShip(){
        }
        public void addPoint(){
        }
        public void addPlayer(int id ){
            this.id=id;
            listobj.listObj(id,mul);
            mul++;
        }
        public int removePlayer(){
            return id;
        }
    
}
