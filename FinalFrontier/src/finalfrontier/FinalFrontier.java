/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalfrontier;

import finalfrontier.view.StartProgramView;



/**
 *
 * @author rschw
 */
public class FinalFrontier {
   
   public String playerName = null;
   public String characterChoice = null;
    
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

