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
    
}
