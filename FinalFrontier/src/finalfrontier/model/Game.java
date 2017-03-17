/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalfrontier.model;

import java.util.ArrayList;
import finalfrontier.model.Character;
import finalfrontier.model.Player;

/**
 *
 * @author rschw
 */
public class Game {
    public Game(String type, int amount){
        
    }
    
    //Game arrayList
    //saving the players name with which character played as, their last location, and previous resource amounts
    
    public ArrayList<Game> addContent(){
    
    ArrayList<Game> content = new ArrayList<>();
    content.add(new Game("Wood", Resources.wood));
    content.add(new Game("Grain", Resources.grain));
    content.add(new Game("Ore", Resources.ore));
    content.add(new Game("Sheep", Resources.sheep));
    content.add(new Game("Swords", Resources.swords));
    content.add(new Game("Gold", Resources.gold));
    return content;
    }
    
}
