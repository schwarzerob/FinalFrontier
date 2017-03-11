/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalfrontier.view;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author rschw
 */
public class ViewIT {
    
    public ViewIT() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of display method, of class View.
     */
    @Test
    public void testDisplay() {
        System.out.println("display");
        View instance = new ViewImpl();
        instance.display();
    }

    /**
     * Test of getInput method, of class View.
     */
    @Test
    public void testGetInput() {
        System.out.println("getInput");
        View instance = new ViewImpl();
        String expResult = "";
        String result = instance.getInput();
        assertEquals(expResult, result);
    }

    public class ViewImpl extends View {
    }
    
}
