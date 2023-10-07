/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.battleshipgame;

/**
 *
 * @author sujiitramurukeshan
 */
public class Ship {
     public String shipName;
        public int shipSize;
        public int shipValue;
        ListObjects listobj=new ListObjects();
        public int mul=0;
        public Player _owner;
    public void addShip( String shipName, int shipSize, int shipValue){
            this.shipName=shipName;
            this.shipSize=shipSize;
            this.shipValue=shipValue;
            listobj.listObj(shipName,shipSize,shipValue,mul);
            mul++;
            
        }
        public void removeShip(String shipName, int shipSize, int shipValue){
            
        }
}
