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
public class GameMenuViewIT {
    
    public GameMenuViewIT() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of displayMenu method, of class GameMenuView.
     */
    @Test
    public void testDisplayMenu() {
        System.out.println("displayMenu");
        GameMenuView instance = new GameMenuView();
        instance.displayMenu();
    }
    
}
