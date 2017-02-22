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
public class LocationControl2IT {
    
    public LocationControl2IT() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of LocationDirection method, of class LocationControl2.
     */
    @Test
    public void testLocationDirection() {
        System.out.println("LocationDirection");
        int row = 0;
        int column = 0;
        char visited = ' ';
        LocationControl2 instance = new LocationControl2();
        int expResult = 0;
        int result = instance.LocationDirection(row, column, visited);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
