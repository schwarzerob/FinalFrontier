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
public class LocationControlIT {
    
    public LocationControlIT() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of Location method, of class LocationControl.
     */
    @Test
    public void testLocation() {
        System.out.println("Location");
        int row = 0;
        int column = 0;
        char visited = ' ';
        LocationControl instance = new LocationControl();
        char expResult = ' ';
        char result = instance.Location(row, column, visited);
        assertEquals(expResult, result);
    }
    
}
