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
import org.mockito.Mockito.*;

/**
 *
 * @author Benjamin
 */
public class DriverTest {
    
    public DriverTest() {
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
     * Test of getCurrentLocation method, of class Driver.
     */
    @Test
    public void testGetCurrentLocation() {
        System.out.println("getCurrentLocation");
        
        Driver instance = null;
        String expResult = "";
        String result = instance.getCurrentLocation();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCurrentIndex method, of class Driver.
     */
    @Test
    public void testGetCurrentIndex() {
        System.out.println("getCurrentIndex");
        Driver instance = null;
        int expResult = 0;
        int result = instance.getCurrentIndex();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of moveTo method, of class Driver.
     */
    @Test
    public void testMoveTo_int() {
        System.out.println("moveTo");
        int index = 0;
        Driver instance = null;
        Boolean expResult = null;
        Boolean result = instance.moveTo(index);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of moveTo method, of class Driver.
     */
    @Test
    public void testMoveTo_String() {
        System.out.println("moveTo");
        String destination = "";
        Driver instance = null;
        Boolean expResult = null;
        Boolean result = instance.moveTo(destination);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
