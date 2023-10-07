/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.battleshipgame;

/**
 *
 * @author sujiitramurukeshan
 */
public class Round {
    public BattleshipGame bg;
    public int noOfRound;
    ListObjects listobj=new ListObjects();
        public void countRoundNo(){
        }
        public void addnoOfRound(int noOfRound){
            this.noOfRound=noOfRound;
            listobj.listObj(noOfRound);
        }
        public void removenoOfRound(){
            this.noOfRound=0;
            System.out.println("Number of rounds: "+noOfRound);
        }
    
}
