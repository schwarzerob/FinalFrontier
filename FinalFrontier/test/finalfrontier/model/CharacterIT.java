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
public class CharacterIT {
    
    public CharacterIT() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of values method, of class Character.
     */
    @Test
    public void testValues() {
        System.out.println("values");
        Character[] expResult = null;
        Character[] result = Character.values();
        assertArrayEquals(expResult, result);
    }

    /**
     * Test of valueOf method, of class Character.
     */
    @Test
    public void testValueOf() {
        System.out.println("valueOf");
        String name = "";
        Character expResult = null;
        Character result = Character.valueOf(name);
        assertEquals(expResult, result);
    }

    /**
     * Test of getDescription method, of class Character.
     */
    @Test
    public void testGetDescription() {
        System.out.println("getDescription");
        Character instance = null;
        String expResult = "";
        String result = instance.getDescription();
        assertEquals(expResult, result);
    }
    
}
