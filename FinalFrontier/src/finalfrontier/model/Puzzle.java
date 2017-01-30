/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalfrontier.model;

import java.io.Serializable;

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
    
}
