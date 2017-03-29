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
import java.io.PrintWriter;



/**
 *
 * @author rschw
 */
public class FinalFrontier {
    
   public String characterChoice = null;
   
   private static Game currentGame = null;
   private static Player playerName =null;
   
   private static PrintWriter outFile = null;
   private static BufferedReader inFile = null;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create StartProgramViewOrig and display the start program view
        StartProgramView startProgramView = new StartProgramView();
        try{
        startProgramView.display();
        }catch(Throwable te){
            System.out.println(te.getMessage());
            startProgramView.display();
        }
     }
}

