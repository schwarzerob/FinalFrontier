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
     * Test of showMap method, of class LocationMapView.
     */
    @Test
    public void testShowMap() {
        System.out.println("showMap");
        LocationMapView instance = new LocationMapView();
        String expResult = "";
        String result = instance.showMap();
        assertEquals(expResult, result);
    }

    /**
     * Test of whereToGo method, of class LocationMapView.
     */
    @Test
    public void testWhereToGo() {
        System.out.println("whereToGo");
        LocationMapView instance = new LocationMapView();
        int expResult = 0;
        int result = instance.whereToGo();
        assertEquals(expResult, result);
    }

    /**
     * Test of doAction method, of class LocationMapView.
     */
    @Test
    public void testDoAction() {
        System.out.println("doAction");
        LocationMapView instance = new LocationMapView();
        boolean expResult = false;
        boolean result = instance.doAction();
        assertEquals(expResult, result);
    }
    
}
