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
public class LocationIT {
    
    public LocationIT() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of getRow method, of class Location.
     */
    @Test
    public void testGetRow() {
        System.out.println("getRow");
        Location instance = new Location();
        int expResult = 0;
        int result = instance.getRow();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRow method, of class Location.
     */
    @Test
    public void testSetRow() {
        System.out.println("setRow");
        int row = 0;
        Location instance = new Location();
        instance.setRow(row);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getColumn method, of class Location.
     */
    @Test
    public void testGetColumn() {
        System.out.println("getColumn");
        Location instance = new Location();
        int expResult = 0;
        int result = instance.getColumn();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setColumn method, of class Location.
     */
    @Test
    public void testSetColumn() {
        System.out.println("setColumn");
        int column = 0;
        Location instance = new Location();
        instance.setColumn(column);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getVisited method, of class Location.
     */
    @Test
    public void testGetVisited() {
        System.out.println("getVisited");
        Location instance = new Location();
        char expResult = ' ';
        char result = instance.getVisited();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setVisited method, of class Location.
     */
    @Test
    public void testSetVisited() {
        System.out.println("setVisited");
        char visited = ' ';
        Location instance = new Location();
        instance.setVisited(visited);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hashCode method, of class Location.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        Location instance = new Location();
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class Location.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object obj = null;
        Location instance = new Location();
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Location.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Location instance = new Location();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
