/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalfrontier.model;

import java.util.Random;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author rschw
 */
public class TreasureIT {
    
    public TreasureIT() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of getResource method, of class Treasure.
     */
    @Test
    public void testGetResource() {
        System.out.println("getResource");
        Treasure instance = new Treasure();
        String expResult = "";
        String result = instance.getResource();
        assertEquals(expResult, result);
    }

    /**
     * Test of setResource method, of class Treasure.
     */
    @Test
    public void testSetResource() {
        System.out.println("setResource");
        Random resource = null;
        Treasure instance = new Treasure();
        instance.setResource(resource);
    }

    /**
     * Test of getLoot method, of class Treasure.
     */
    @Test
    public void testGetLoot() {
        System.out.println("getLoot");
        Treasure instance = new Treasure();
        int expResult = 0;
        int result = instance.getLoot();
        assertEquals(expResult, result);
    }

    /**
     * Test of setLoot method, of class Treasure.
     */
    @Test
    public void testSetLoot() {
        System.out.println("setLoot");
        int loot = 0;
        Treasure instance = new Treasure();
        instance.setLoot(loot);
    }

    /**
     * Test of hashCode method, of class Treasure.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        Treasure instance = new Treasure();
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
    }

    /**
     * Test of equals method, of class Treasure.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object obj = null;
        Treasure instance = new Treasure();
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
    }

    /**
     * Test of toString method, of class Treasure.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Treasure instance = new Treasure();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
    }
    
}
