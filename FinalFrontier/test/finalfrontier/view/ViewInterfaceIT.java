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
 * @author rschw
 */
public class ViewInterfaceIT {
    
    public ViewInterfaceIT() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of display method, of class ViewInterface.
     */
    @Test
    public void testDisplay() {
        System.out.println("display");
        ViewInterface instance = new ViewInterfaceImpl();
        instance.display();
    }

    /**
     * Test of getInput method, of class ViewInterface.
     */
    @Test
    public void testGetInput() {
        System.out.println("getInput");
        ViewInterface instance = new ViewInterfaceImpl();
        String expResult = "";
        String result = instance.getInput();
        assertEquals(expResult, result);
    }

    /**
     * Test of doAction method, of class ViewInterface.
     */
    @Test
    public void testDoAction() {
        System.out.println("doAction");
        String value = "";
        ViewInterface instance = new ViewInterfaceImpl();
        boolean expResult = false;
        boolean result = instance.doAction(value);
        assertEquals(expResult, result);
    }

    public class ViewInterfaceImpl implements ViewInterface {

        public void display() {
        }

        public String getInput() {
            return "";
        }

        public boolean doAction(String value) {
            return false;
        }
    }
    
}
