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
 * @author Gabriel
 */
public class CraftingViewTest {
    
    public CraftingViewTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of doAction method, of class CraftingView.
     */
    @Test
    public void testDoAction() {
        System.out.println("doAction");
        String value = "B";
        CraftingView instance = new CraftingView();
        boolean expResult = false;
        boolean result = instance.doAction(value);
        assertEquals(expResult, result);
        
    }
    
}
