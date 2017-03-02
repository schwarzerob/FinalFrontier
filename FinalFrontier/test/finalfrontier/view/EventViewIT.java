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
public class EventViewIT {
    
    public EventViewIT() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of randomEvent method, of class EventView.
     */
    @Test
    public void testRandomEvent() {
        System.out.println("randomEvent");
        int createEvent = 0;
        EventView instance = new EventView();
        boolean expResult = false;
        boolean result = instance.randomEvent(createEvent);
        assertEquals(expResult, result);
    }
    
}
