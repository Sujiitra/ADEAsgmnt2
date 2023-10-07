/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.battleshipgame;

/**
 *
 * @author sujiitramurukeshan
 */
public class Grid {
    public BattleshipGame bg;
    public int xGrid;
        public int yGrid;
        public String gridName;
        ListObjects listobj=new ListObjects();
        public int mul=1;
        public void placeShip(){
        }
         public void addGrid(String gridName){
            this.gridName=gridName;
            listobj.listObj(gridName,mul);
            mul++;
        }
        public void removeGrid(int xGrid, int yGrid){
            
        }
    
}
