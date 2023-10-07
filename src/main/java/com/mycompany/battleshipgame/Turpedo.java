/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.battleshipgame;

/**
 *
 * @author sujiitramurukeshan
 */
public class Turpedo {
    public int xCo;
        public int yCo;
        public Player _defender;
        public int mul=0;
        ListObjects listobj=new ListObjects();
        public void hit(){
        }
         public void addTurpedo(int xCo, int yCo ){
            this.xCo=xCo;
            this.yCo=yCo;
            listobj.listObj(xCo,yCo,mul);
            mul++;
        }
        public void removeTurpedo(int xCo, int yCo){
            
        }
    
    
}
