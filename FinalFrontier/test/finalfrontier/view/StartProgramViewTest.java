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
public class StartProgramViewTest {
    
    public StartProgramViewTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of doAction method, of class StartProgramView.
     */
    @Test
    public void testDoAction() {
        System.out.println("doAction");
        String playersName = "Gob";
        StartProgramView instance = new StartProgramView();
        boolean expResult = false;
        boolean result = instance.doAction(playersName);
        assertEquals(expResult, result);
        
    }
    
}
