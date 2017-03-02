/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalfrontier.model;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author rschw
 */
public class EventIT {
    
    public EventIT() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of getSymbol method, of class Event.
     */
    @Test
    public void testGetSymbol() {
        System.out.println("getSymbol");
        Event instance = new Event();
        String expResult = "";
        String result = instance.getSymbol();
        assertEquals(expResult, result);
    }

    /**
     * Test of getDescription method, of class Event.
     */
    @Test
    public void testGetDescription() {
        System.out.println("getDescription");
        Event instance = new Event();
        String expResult = "";
        String result = instance.getDescription();
        assertEquals(expResult, result);
    }

    /**
     * Test of getBlockedLocation method, of class Event.
     */
    @Test
    public void testGetBlockedLocation() {
        System.out.println("getBlockedLocation");
        Event instance = new Event();
        String expResult = "";
        String result = instance.getBlockedLocation();
        assertEquals(expResult, result);
    }

    /**
     * Test of setSymbol method, of class Event.
     */
    @Test
    public void testSetSymbol() {
        System.out.println("setSymbol");
        String symbol = "";
        Event instance = new Event();
        instance.setSymbol(symbol);
    }

    /**
     * Test of setDescription method, of class Event.
     */
    @Test
    public void testSetDescription() {
        System.out.println("setDescription");
        String description = "";
        Event instance = new Event();
        instance.setDescription(description);
    }

    /**
     * Test of setBlockedLocation method, of class Event.
     */
    @Test
    public void testSetBlockedLocation() {
        System.out.println("setBlockedLocation");
        String blockedLocation = "";
        Event instance = new Event();
        instance.setBlockedLocation(blockedLocation);
    }

    /**
     * Test of hashCode method, of class Event.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        Event instance = new Event();
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
    }

    /**
     * Test of equals method, of class Event.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object obj = null;
        Event instance = new Event();
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
    }

    /**
     * Test of toString method, of class Event.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Event instance = new Event();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
    }
    
}
