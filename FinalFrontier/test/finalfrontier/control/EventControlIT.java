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
public class EventControlIT {
    
    public EventControlIT() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of lootTreasure method, of class EventControl.
     */
    @Test
    public void testLootTreasure() {
        System.out.println("lootTreasure");
        EventControl.lootTreasure();
    }

    /**
     * Test of puzzelEvent method, of class EventControl.
     */
    @Test
    public void testPuzzelEvent() {
        System.out.println("puzzelEvent");
        EventControl.puzzleEvent();
    }

    /**
     * Test of timeToAttack method, of class EventControl.
     */
    @Test
    public void testTimeToAttack() {
        System.out.println("timeToAttack");
        EventControl.timeToAttack();
    }

    /**
     * Test of Event method, of class EventControl.
     */
    @Test
    public void testEvent() {
        System.out.println("Event");
        char symbol = ' ';
        String description = "";
        EventControl instance = new EventControl();
        String expResult = "";
        String result = instance.Event(symbol, description);
        assertEquals(expResult, result);
    }
    
}
