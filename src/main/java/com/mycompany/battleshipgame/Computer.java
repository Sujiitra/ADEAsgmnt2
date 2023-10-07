/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.battleshipgame;

/**
 *
 * @author sujiitramurukeshan
 */
public class Computer extends Player{
     private int codeNo;
      ListObjects listobj=new ListObjects();
      public void addcodeNo(int codeNo){
            this.codeNo=codeNo;
            listobj.listObj(codeNo,"ComputerCode");
          
        }
        public void removecodeNo(int codeNo){
            
        }
    
}
