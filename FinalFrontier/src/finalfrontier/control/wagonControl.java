/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalfrontier.control;

import finalfrontier.exceptions.WagonException;
import finalfrontier.model.Resources;
import finalfrontier.model.Wagon;
import java.io.Serializable;

/**
 *
 * @author rschw
 */
public class wagonControl implements Serializable {

    public wagonControl() {
    }
    
    public static void longer(int howFar) 
        throws WagonException{
            //cost: 1 wood per increased area
            Wagon.length+=howFar;
            int increase = Wagon.height*Wagon.width*howFar;
            Wagon.area += increase;
            Resources.wood-=increase;
        throw new WagonException();
    }
    public static void wider(int howWide) 
        throws WagonException{
            //cost: 1 wood per increased area
            Wagon.width+=howWide;
            int increase = Wagon.length*Wagon.height*howWide;
            Wagon.area += increase;
            Resources.wood-=increase;
        throw new WagonException();
    }
    public static void taller(int howTall) 
        throws WagonException{
            //cost: 1 wood per increased area
            Wagon.height+=howTall;
            int increase = Wagon.length*Wagon.width*howTall;
            Wagon.area += increase;
            Resources.wood-=increase;
        throw new WagonException();
    }

    //void calcMaxContent(double length, double width, double height) {
    //    throw new UnsupportedOperationException("Not supported yet."); 
    //To change body of generated methods, choose Tools | Templates.
    //}
    
}
