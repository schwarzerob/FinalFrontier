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
public class HelpMenuViewTest {
    
    public HelpMenuViewTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of displayHelpMenuView method, of class HelpMenuView.
     */
    @Test
    public void testDisplayHelpMenuView() {
        System.out.println("displayHelpMenuView");
        HelpMenuView instance = new HelpMenuView();
        instance.displayHelpMenuView();
        
    }

    /**
     * Test of doAction method, of class HelpMenuView.
     */
    @Test
    public void testDoAction() {
        System.out.println("doAction");
        String menuOption = "";
        HelpMenuView instance = new HelpMenuView();
        boolean expResult = false;
        boolean result = instance.doAction(menuOption);
        assertEquals(expResult, result);
        
    }
    
}
