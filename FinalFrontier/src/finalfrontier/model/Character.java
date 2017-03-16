/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalfrontier.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Gabriel
 */
public class Character implements Serializable {
    
    
    
    /*
    public enum Character {
     CHARACTER1("description", gold, grain, etc.);
    private Character(String desc, int gold, int grain, etc.){
    this.desc = desc;
    ...
    public String getDesc(){
       return desc; }
    public int getGold(){
       return gold; }
    ...
    }
    */
    
    
    
    // Who is this character, and what are their benefits?
    private String characterName;
    private String whatIsCharacter;

// Character constructor
public Character (){
}   

// getter for characterName and whereIsCharacter
    public String getCharacterName() {
        return characterName;
    }
    public String getWhereIsCharacter() {
        return whatIsCharacter;
    }

//Setter characterName and whereIsCharacter
    public void setCharacterName(String characterName) {
        this.characterName = characterName;
    }
    public void setWhereIsCharacter(String whereIsCharacter) {
        this.whatIsCharacter = whereIsCharacter;
    }
    
//hash
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 71 * hash + Objects.hashCode(this.characterName);
        hash = 71 * hash + Objects.hashCode(this.whatIsCharacter);
        return hash;
    }
    
//equals
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Character other = (Character) obj;
        if (!Objects.equals(this.characterName, other.characterName)) {
            return false;
        }
        if (!Objects.equals(this.whatIsCharacter, other.whatIsCharacter)) {
            return false;
        }
        return true;
    }
    
//toString
    @Override
    public String toString() {
        return "Character{" + "characterName=" + characterName + ", whereIsCharacter=" + whatIsCharacter + '}';
    }
    
}

