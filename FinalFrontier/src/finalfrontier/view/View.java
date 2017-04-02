/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalfrontier.view;

import finalfrontier.FinalFrontier;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

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
        
        //Scanner keyboard = new Scanner(System.in);
        boolean valid = false;
        String value = null;
        
        // while a valid name has not been retrieved
        try{
            while (!valid){
                this.console.println("\n"+this.displayMessage);
                
                // get the value entered from the keyboard
                
                //value = keyboard.nextLine();
                value = this.keyboard.readLine();
                value = value.trim().toUpperCase();
                
                
                if(value.length() < 1){ // blank value entered
                    ErrorView.display(this.getClass().getName(), "\n ****You must enter a value****");
                    continue;
                }
                break;
            }
        } catch (IOException ex) {
            ErrorView.display(this.getClass().getName(), "Error getting input: "+ex);
        }
        return value;  // return the name
    }
    
}
