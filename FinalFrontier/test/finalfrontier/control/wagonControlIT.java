/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalfrontier.control;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author rschw
 */
public class wagonControlIT {
    
    public wagonControlIT() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of calcMaxContent method, of class wagonControl.
     */
    @Test
    public void testCalcMaxContent() {
        System.out.println("calcMaxContent");
        String dimension = "";
        int length = 0;
        int width = 0;
        int height = 0;
        int increase = 0;
        wagonControl instance = new wagonControl();
        int expResult = 0;
        int result = instance.calcMaxContent(dimension, length, width, height, increase);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
