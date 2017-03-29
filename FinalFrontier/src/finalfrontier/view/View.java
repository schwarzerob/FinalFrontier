/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalfrontier.view;

import finalfrontier.FinalFrontier;
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author rschw
 */
public abstract class View implements ViewInterface{
    protected String displayMessage;
    
    protected final BufferedReader keyboard = FinalFrontier.getInFile();
    protected final PrintWriter console = FinalFrontier.getOutFile();
    
    public View() {
    }
    
    public View(String message) {
        this.displayMessage = message;
    }
    
    @Override
    public void display(){
        boolean done = false;
        do{
            // prompt for and get players name
            String value = this.getInput();
            if (value.toUpperCase().equals("Q"))
                return;
            done = this.doAction(value);
            
            // do the requested action and display the next view
        } while (!done); // exit the view when  done == true
    }

    @Override
    public String getInput() {
        boolean valid = false;
        String value = null;
        
        // while a valid name has not been retrieved
        while (!valid){
            System.out.println("\n"+this.displayMessage);
            
            // get the value entered from the keyboard
            value = this.keyboard.readLine();
            value = value.trim().toUpperCase();
            
            
            if(value.length() < 1){ // blank value entered
                System.out.println("\n ****You must enter a value****");
                continue;
            }
            break;
        }
        return value;  // return the name
    }
    
}
