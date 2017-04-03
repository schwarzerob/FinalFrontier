/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalfrontier.view;

import finalfrontier.control.wagonControl;
import finalfrontier.exceptions.WagonException;
import finalfrontier.model.Wagon;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author rschw
 */
public class WagonView extends View{

    public WagonView(String message) {
        super("Your wagon where you carry all of your items. \n"
                + "So, should we make your wagon bigger?\n"
                + "How do we do it?\n"
                + "T  Taller \n"
                + "W  Wider \n"
                + "L  Longer\n"
                + "N  Nevermind");
    }

    public WagonView() {
    }
    

    @Override
    public boolean doAction(String value) {
        try {
            String side = value.toUpperCase();
            switch (side){
                case "T":
                    int howFar = this.keyboard.read();
                    wagonControl.longer(howFar);
                case "W":
                    int howWide = this.keyboard.read();
                    wagonControl.wider(howWide);
                case "L":
                    int howLong = this.keyboard.read();
                    wagonControl.taller(howLong);
                case "N":
                    CraftingView neverMind = new CraftingView();
                    neverMind.display();
            }
            return false;
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        } catch (WagonException ex) {
            Logger.getLogger(WagonView.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(WagonView.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
}
