/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.battleshipgame;

/**
 *
 * @author sujiitramurukeshan
 */
public class GameMain {

    public static void main(String[] args) {
        Player p= new Player();
        Turpedo t=new Turpedo();
        Ship s=new Ship();
        Grid g=new Grid();
        Round r=new Round();
        BattleshipGame bg=new BattleshipGame();
        bg.addtypeOfGame("Play with Computer");
        p.addPlayer(1001);
        p.addPlayer(1002);
        p.addPlayer(1003);
        t.addTurpedo(5, 8);
        s.addShip("Cargo", 3, 200);
        g.addGrid("Checked Grid");
        g.addGrid("Circle Grid");
        r.addnoOfRound(4);
        r.removenoOfRound();
    }
}
