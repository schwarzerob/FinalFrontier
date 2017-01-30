/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalfrontier.model;

import java.io.Serializable;

/**
 *
 * @author Gabriel
 */
public class Character implements Serializable {
    private String characterName;
    private String whereIsCharacter;

public Character (){
    
}   
// getter for characterName and whereIsCharacter
    public String getCharacterName() {
        return characterName;
    }

    public String getWhereIsCharacter() {
        return whereIsCharacter;
    }

//Setter characterName and whereIsCharacter

    public void setCharacterName(String characterName) {
        this.characterName = characterName;
    }

    public void setWhereIsCharacter(String whereIsCharacter) {
        this.whereIsCharacter = whereIsCharacter;
    }
    

}

