/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalfrontier.model;

import java.util.ArrayList;
import java.io.Serializable;

/**
 *
 * @author rschw
 */
public class Player implements Serializable{
    public static String name;
    public static String character;
    
// Constructor
    public Player(String name1, String character1) {
    }

        /*
        playerName
        Character
        location
        resources
        */
    
    ArrayList<Player> playerName(){
    ArrayList<Player> nameList = new ArrayList<>();
    nameList.add(new Player(name, character));
    return nameList;
    }
    
    
    
// get and set Name    
// What is this players name?
    public String getName() {
        return name;
    }
    public void setName(String name) {
        Player.name = name;
    }
    
// What character is the Player using?

    public String getCharacter() {
        return character;
    }
    public void setCharacter(String character) {
        Player.character = character;
    }
}
