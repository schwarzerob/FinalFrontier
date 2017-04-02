/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalfrontier.control;

import finalfrontier.model.Game;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author rschw
 */
public class GameControlIT {
    
    public GameControlIT() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of createPlayer method, of class GameControl.
     */
    @Test
    public void testCreatePlayer() throws Exception {
        System.out.println("createPlayer");
        String name = "";
        GameControl instance = new GameControl();
        String expResult = "";
        String result = instance.createPlayer(name);
        assertEquals(expResult, result);
    }

    /**
     * Test of saveGame method, of class GameControl.
     */
    @Test
    public void testSaveGame() throws Exception {
        System.out.println("saveGame");
        Game game = null;
        String filePath = "";
        GameControl.saveGame(game, filePath);
    }

    /**
     * Test of mostItem method, of class GameControl.
     */
    @Test
    public void testMostItem() throws Exception {
        System.out.println("mostItem");
        GameControl instance = new GameControl();
        String expResult = "";
        String result = instance.mostItem();
        assertEquals(expResult, result);
    }

    /**
     * Test of resumeGame method, of class GameControl.
     */
    @Test
    public void testResumeGame() {
        System.out.println("resumeGame");
        String player = "";
        GameControl instance = new GameControl();
        instance.resumeGame(player);
    }

    /**
     * Test of savedGames method, of class GameControl.
     */
    @Test
    public void testSavedGames() {
        System.out.println("savedGames");
        GameControl instance = new GameControl();
        String expResult = "";
        String result = instance.savedGames();
        assertEquals(expResult, result);
    }

    /**
     * Test of printReports method, of class GameControl.
     */
    @Test
    public void testPrintReports() throws Exception {
        System.out.println("printReports");
        GameControl instance = new GameControl();
        instance.printReports();
    }
    
}
