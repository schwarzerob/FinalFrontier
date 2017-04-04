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

    public WagonView() {
        super("Your wagon is how you will carry all of your items. \n"
                + "So far, it's "+Wagon.height+" x "+Wagon.length+" x "+Wagon.width+". \nWhich can hold "+Wagon.area+" items."
                + "So, should we make your wagon bigger?\n"
                + "How do we do it?\n"
                + "T  Taller \n"
                + "W  Wider \n"
                + "L  Longer\n"
                + "N  Nevermind");
    }
    

    @Override
    public boolean doAction(String value) {
        try {
            String side = value.toUpperCase();
            int howFar=0;
            wagonControl wagonCont = new wagonControl();
                //String side = "T";
            switch (side){
                case "L":
                    this.console.println("How much?");
                    //howFar = this.keyboard.read();
                    wagonCont.longer(howFar);
                case "W":
                    howFar = this.keyboard.read();
                    wagonCont.wider(howFar);
                case "T":
                    howFar = this.keyboard.read();
                    wagonCont.taller(howFar);
                case "N":
                    CraftingView neverMind = new CraftingView();
                    neverMind.display();
            }
            return true;
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        } catch (WagonException | IOException ex) {
            Logger.getLogger(WagonView.class.getName()).log(Level.SEVERE, null, ex);
        }
        return true;
    }
    
}
