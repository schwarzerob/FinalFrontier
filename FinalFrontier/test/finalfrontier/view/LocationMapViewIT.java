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
public class LocationMapViewIT {
    
    public LocationMapViewIT() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of DisplayLocationMapView method, of class LocationMapView.
     */
    @Test
    public void testDisplayLocationMapView() {
        System.out.println("DisplayLocationMapView");
        LocationMapView instance = new LocationMapView();
        instance.DisplayLocationMapView();
    }

    /**
     * Test of doAction method, of class LocationMapView.
     */
    @Test
    public void testDoAction() {
        System.out.println("doAction");
        String direction = "";
        LocationMapView instance = new LocationMapView();
        boolean expResult = false;
        boolean result = instance.doAction(direction);
        assertEquals(expResult, result);
    }
    
}
