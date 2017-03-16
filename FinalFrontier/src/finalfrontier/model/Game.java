/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalfrontier.model;

import java.util.ArrayList;
import finalfrontier.model.Character;

/**
 *
 * @author rschw
 */
public class Game {
    String playerName = Player.name;
    String charName = Character.characterName;

    public Game() {
    }
    //Game arrayList
    //saving the players name with which character played as, their last location, and previous resource amounts
    
    
    public ArrayList<Game> saveGame(){
    ArrayList<Game> gameList = new ArrayList<>();
    gameList.add(new Game(Player.name,0));
    gameList.add(new Game(Character.characterName));
    gameList.add(new Game(Map.mapMatrix[mapRow][mapColumn]));
    //gameList.add(new Game(resources));
    gameList.add(new Game("Wood", Resources.wood));
    //...
        return null;
    }
}
