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
        int expResult = 5;
        int result = Location.getMaxLocs();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getCity method for the default city, of class Location.
     */
    @Test
    public void testGetCity() {
        System.out.println("getCity");
        Location[] expResult = new Location[5];
        expResult[0]=new Location("Hotel",1,-1,2, -1);
        expResult[1]=new Location("Diner",4,-1,-1, 3);
        expResult[2]=new Location("Library",-1,4,0, -1);
        expResult[3]=new Location("College",-1,2,-1, 1);
        expResult[4]=new Location("Outside City",0,3,-1, -1);
        Location[] result = Location.getCity();
        for (int i=0;i<5;i++){
            assertEquals(expResult[i].getName(), result[i].getName());
        }
        //assertArrayEquals(expResult, result);
    }

    /**
     * Test of getName method, of class Location.
     */
    @Test
    public void testGetName() {
        
        System.out.println("getName");
        Location instance = new Location("Hotel",0,3,-1, -1);;
        String expResult = "Hotel";
        String result = instance.getName();
        assertEquals(expResult, result);
    }

    /**
     * Test of getDestArray method, of class Location.
     */
    @Test
    public void testGetDestArray() {
        System.out.println("getDestArray");
        Location instance = new Location("Hotel",0,3,-1, -1);
        int[] expResult =  new int[] {0,3,-1, -1};
        int[] result = instance.getDestArray();
        assertArrayEquals(expResult, result);
    }
    /**
     * Test of getDestArray method, of class Location, using a filled city
     */
    @Test
    public void testGetDestArray_usingGetCity() {
        System.out.println("getDestArray");
        Location[] city=Location.getCity();
        Location instance = city[0];
        int[] expResult = {1,-1,2, -1};
        int[] result = instance.getDestArray();
        
        //dependant tests
        assertArrayEquals(expResult, result);
        instance = city[1];
        expResult = new int[] {4 , -1 , -1 , 3};
        result = instance.getDestArray();
        assertArrayEquals(expResult, result);
        instance = city[2];
        expResult = new int[] {-1,4,0, -1};
        result = instance.getDestArray();
        assertArrayEquals(expResult, result);
        instance = city[3];
        expResult = new int[] {-1,2,-1, 1};
        result = instance.getDestArray();
        assertArrayEquals(expResult, result);
        instance = city[4];
        expResult = new int[] {0,3,-1, -1};
        result = instance.getDestArray();
        assertArrayEquals(expResult, result);
    }
    
}
