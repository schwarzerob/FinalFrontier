/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalfrontier;

import finalfrontier.model.Game;
import finalfrontier.model.Player;
import finalfrontier.view.StartProgramView;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;



/**
 *
 * @author rschw
 */
public class FinalFrontier {

    public static int row;
    
   public String characterChoice = null;
   private static Game currentGame = null;
   private static Player playerName =null;
   
   private static PrintWriter outFile = null;
   private static BufferedReader inFile = null;
   
   private static PrintWriter logFile = null;
   
     /**
     * @param args the command line arguments
     */
   
    public static void main(String[] args) {
        // create StartProgramViewOrig and display the start program view
        
        try{
            FinalFrontier.inFile = 
                    new BufferedReader(new InputStreamReader(System.in));
            FinalFrontier.outFile = new PrintWriter(System.out, true);
            
            String filePath = "log.txt";
            FinalFrontier.logFile = new PrintWriter(filePath);
            
        StartProgramView startProgramView = new StartProgramView();
        startProgramView.display();
        }catch(Throwable te){
            System.out.println("Exception" + te.toString() +
                                //"\nCause: " + e.getCause +
                                "\nMessage" + te.getMessage());
            te.printStackTrace();
            //startProgramView.display();
        }
        finally {
            try {
                if(FinalFrontier.inFile!= null)
                FinalFrontier.inFile.close();
                
                if(FinalFrontier.outFile != null)
                FinalFrontier.outFile.close();
                
                if(FinalFrontier.logFile != null)
                FinalFrontier.logFile.close();
            } catch (IOException ex) {
                System.out.println("Error, closing files");
                return;
            }
        }
     }

    public String getCharacterChoice() {
        return characterChoice;
    }

    public void setCharacterChoice(String characterChoice) {
        this.characterChoice = characterChoice;
    }

    public static Game getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(Game currentGame) {
        FinalFrontier.currentGame = currentGame;
    }

    public static Player getPlayerName() {
        return playerName;
    }

    public static void setPlayerName(Player playerName) {
        FinalFrontier.playerName = playerName;
    }

    public static PrintWriter getOutFile() {
        return outFile;
    }

    public static void setOutFile(PrintWriter outFile) {
        FinalFrontier.outFile = outFile;
    }

    public static BufferedReader getInFile() {
        return inFile;
    }

    public static void setInFile(BufferedReader inFile) {
        FinalFrontier.inFile = inFile;
    }

    public static PrintWriter getLogFile() {
        return logFile;
    }

    public static void setLogFile(PrintWriter logFile) {
        FinalFrontier.logFile = logFile;
    }
    
    
}

