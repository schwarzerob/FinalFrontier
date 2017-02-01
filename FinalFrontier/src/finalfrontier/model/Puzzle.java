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
 * @author rschw
 */
public class Puzzle implements Serializable{
    private String Description;
    private String CorrectAnswer;
    
    public Puzzle(){
        }
    
// get and set Description
    public String getDescription() {
        return Description;
    }
    
    public void setDescription(String Description) {
        this.Description = Description;
    }
    
// get and set CorrectAnswer
    public String getCorrectAnswer() {
        return CorrectAnswer;
    }    
    public void setCorrectAnswer(String CorrectAnswer) {
        this.CorrectAnswer = CorrectAnswer;
    }
    
// hashCode
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 11 * hash + Objects.hashCode(this.Description);
        hash = 11 * hash + Objects.hashCode(this.CorrectAnswer);
        return hash;
    }
    
// equals
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
        final Puzzle other = (Puzzle) obj;
        if (!Objects.equals(this.Description, other.Description)) {
            return false;
        }
        if (!Objects.equals(this.CorrectAnswer, other.CorrectAnswer)) {
            return false;
        }
        return true;
    }
    
// toString
    @Override
    public String toString() {
        return "Puzzle{" + "Description=" + Description + ", CorrectAnswer=" + CorrectAnswer + '}';
    }
    
}
