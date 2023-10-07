/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.battleshipgame;

/**
 *
 * @author sujiitramurukeshan
 */
public class ListObjects {
    public void listObj(int noOfRound){
       System.out.println("Number of rounds: "+noOfRound);
    }
     public void listObj(String name){
       System.out.println("Player name is "+name);
    }
      public void listObj(int codeNo,String name){
       System.out.println("Player name is "+codeNo);
    }
      public void listObj(String gridName,int mul){
        if(mul<3)  
            System.out.println("Grid name of Player "+mul+" is "+gridName);
        else
            System.out.println("Number of Grids cannot be more than 3");
    }
    public void listObj(int id, int mul){
        if(mul<3)  
            System.out.println("Player id "+id);
        else
            System.out.println("Number of players cannot be more than 2");
    }
    public void listObj(int xCo,int yCo, int mul){
        if(mul<46)  
            System.out.println("Turpedo is targeting xCo:"+xCo+" and yCo:"+yCo);
        else
            System.out.println("Number of turpedo cannot be more than 45");
    }
    public void listObj(String shipName,int shipSize, int shipValue,int mul){
        if(mul<7)  
            System.out.println("Ship name is "+shipName+" of size "+shipSize+" and of value "+shipValue);
        else
            System.out.println("Number of Ships cannot be more than 6");
    }
}
