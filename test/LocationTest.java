/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Benjamin
 */
public class LocationTest {
    
    public LocationTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getMaxLocs method, of class Location.
     */
    @Test
    public void testGetMaxLocs() {
        System.out.println("getMaxLocs");
        int expResult = 0;
        int result = Location.getMaxLocs();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCity method, of class Location.
     */
    @Test
    public void testGetCity() {
        System.out.println("getCity");
        Location[] expResult = null;
        Location[] result = Location.getCity();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getName method, of class Location.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Location instance = null;
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDestArray method, of class Location.
     */
    @Test
    public void testGetDestArray() {
        System.out.println("getDestArray");
        Location instance = null;
        int[] expResult = null;
        int[] result = instance.getDestArray();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
