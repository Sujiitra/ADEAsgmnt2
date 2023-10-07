/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.battleshipgame;

import java.util.Vector;

/**
 *
 * @author sujiitramurukeshan
 */
public class BattleshipGame {
    public String startTime;
	public String endTime;
	public String typeOfGame;
	public String outcome;
	public Player p;
	public Vector<Round> vecR = new Vector<Round>();
	public Vector<Grid> vecG = new Vector<Grid>();
          public void addtypeOfGame(String typeOfGame){
            this.typeOfGame=typeOfGame;
            System.out.println("Type of Game is "+typeOfGame);
        }
        public void removetypeOfGame(String typeOfGame){
            
        }
    
}
