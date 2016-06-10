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
import static org.mockito.Mockito.*;

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
        
        Driver instance = new Driver(0);
        String expResult = "Hotel";
        String result = instance.getCurrentLocation();
        assertEquals(expResult, result);
    }

    /**
     * Test of getCurrentIndex method, of class Driver.
     */
    @Test
    public void testGetCurrentIndex() {
        System.out.println("getCurrentIndex");
        Driver instance = new Driver(0);
        int expResult = 0;
        int result = instance.getCurrentIndex();
        assertEquals(expResult, result);
    }

    /**
     * Test of moveTo method, of class Driver.
     */
    @Test
    public void testMoveTo_int() {
        System.out.println("moveTo");
        int index = 2;
        Driver instance = new Driver(0);
        int expResult = 2;
        int result = instance.moveTo(index);
        assertEquals(expResult, result);
        assertEquals(instance.getCurrentIndex(),2);

    }

    /**
     * Test of moveTo method, of class Driver.
     */
    @Test
    public void testMoveTo_String() {
        System.out.println("moveTo");
        String destination = "College";
        Driver instance = new Driver(0);
        int expResult = -1;
        int result = instance.moveTo(destination);
        assertEquals(expResult, result);
        destination = "Diner";
        expResult = 0;
        result = instance.moveTo(destination);
        assertEquals(expResult, result);
        assertEquals(instance.getCurrentLocation(),destination);
    }
    
}
