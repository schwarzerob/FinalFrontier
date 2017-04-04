/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalfrontier.control;

import finalfrontier.FinalFrontier;
import finalfrontier.exceptions.WagonException;
import finalfrontier.model.Resources;
import finalfrontier.model.Wagon;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author rschw
 */
public class wagonControl implements Serializable {

    public wagonControl() {
        
    }
    
    protected final BufferedReader keyboard = FinalFrontier.getInFile();
    protected final PrintWriter console = FinalFrontier.getOutFile();
    
    public void longer(int howFar) 
        throws WagonException{
        try {
            //cost: 1 wood per increased area
            howFar = this.keyboard.read();
            int length=Wagon.getLength();
            Wagon.setLength(length+howFar);
            int increase = Wagon.getHeight()*Wagon.getWidth()*howFar;
            Wagon.setArea(Wagon.getWidth()*Wagon.getLength()*Wagon.getHeight());
            Resources.wood-=increase;
            this.console.println("Increases by: "+increase+", Cost: "+increase+" wood.");
        } catch (IOException ex) {
            throw new WagonException(ex.getMessage());
        }
    }
    public void wider(int howFar) 
        throws WagonException{
            //cost: 1 wood per increased area
            Wagon.width+=howFar;
            int increase = Wagon.length*Wagon.height*howFar;
            Wagon.area += increase;
            Resources.wood-=increase;
    }
    public void taller(int howFar) 
        throws WagonException{
            //cost: 1 wood per increased area
            Wagon.height+=howFar;
            int increase = Wagon.length*Wagon.width*howFar;
            Wagon.area += increase;
            Resources.wood-=increase;
    }

    //void calcMaxContent(double length, double width, double height) {
    //    throw new UnsupportedOperationException("Not supported yet."); 
    //To change body of generated methods, choose Tools | Templates.
    //}
    
}
