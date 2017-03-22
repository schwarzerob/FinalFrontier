/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalfrontier.control;

import finalfrontier.model.MyCharacter;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author rschw
 */
public class CharacterControlIT {
    
    public CharacterControlIT() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of alphabetically method, of class CharacterControl.
     */
    @Test
    public void testAlphabetically() {
        System.out.println("alphabetically");
        MyCharacter[] args = null;
        MyCharacter[] expResult = null;
        MyCharacter[] result = CharacterControl.alphabetically(args);
        assertArrayEquals(expResult, result);
    }
    
}
