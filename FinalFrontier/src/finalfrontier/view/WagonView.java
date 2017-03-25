/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalfrontier.view;

import finalfrontier.control.wagonControl;
import finalfrontier.exceptions.WagonException;
import finalfrontier.model.Wagon;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author rschw
 */
public class WagonView extends View{

    public WagonView(String message) {
        super("Your wagon has room for "+Wagon.area+" items. \n"
                + "So, let's make your wagon bigger!\n"
                + "T  Taller \n"
                + "W  Wider \n"
                + "L  Longer");
    }

    public WagonView() {
    }
    

    @Override
    public boolean doAction(String value) {
        try {
            String side = value.toUpperCase();
            Scanner keyboard = new Scanner(System.in);
            switch (side){
                case "T":
                    int howFar = keyboard.nextInt();
                    wagonControl.longer(howFar);
                case "W":
                    int howWide = keyboard.nextInt();
                    wagonControl.wider(howWide);
                case "L":
                    int howLong = keyboard.nextInt();
                    wagonControl.taller(howLong);
            }
            return false;
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        } catch (WagonException ex) {
            Logger.getLogger(WagonView.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
}
