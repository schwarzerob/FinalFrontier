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
public class CraftingControlIT {
    
    public CraftingControlIT() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of craftMaster method, of class CraftingControl.
     */
    @Test
    public void testCraftMaster() {
        System.out.println("craftMaster");
        int radius = 0;
        int area = 0;
        CraftingControl instance = new CraftingControl();
        int expResult = 0;
        int result = instance.craftMaster(radius, area);
        assertEquals(expResult, result);
      
    }

    /**
     * Test of craftSword method, of class CraftingControl.
     */
    @Test
    public void testCraftSword() throws Exception {
        System.out.println("craftSword");
        CraftingControl.craftSword();
    }

    /**
     * Test of craftShield method, of class CraftingControl.
     */
    @Test
    public void testCraftShield() throws Exception {
        System.out.println("craftShield");
        CraftingControl.craftShield();
    }

    /**
     * Test of craftBow method, of class CraftingControl.
     */
    @Test
    public void testCraftBow() throws Exception {
        System.out.println("craftBow");
        CraftingControl.craftBow();
    }

    /**
     * Test of craftRope method, of class CraftingControl.
     */
    @Test
    public void testCraftRope() throws Exception {
        System.out.println("craftRope");
        CraftingControl.craftRope();
    }

    /**
     * Test of craftWagon method, of class CraftingControl.
     */
    @Test
    public void testCraftWagon() throws Exception {
        System.out.println("craftWagon");
        CraftingControl.craftWagon();
    }

    /**
     * Test of leastToMost method, of class CraftingControl.
     */
    @Test
    public void testLeastToMost() {
        System.out.println("leastToMost");
        CraftingControl instance = new CraftingControl();
        instance.leastToMost();
    }
    
}
