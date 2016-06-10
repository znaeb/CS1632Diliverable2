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
public class CityTest {
    
    public CityTest() {
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
     * Test of getLoc method, of class City.
     */
    @Test
    public void testGetLoc_int() {
        System.out.println("getLoc");
        int index = 0;
        City instance = new City();
        Location expResult =mock(Location.class);
        when(expResult.getName()).thenReturn("Hotel");
        int[] arrayEx={1,-1,2, -1};
        when(expResult.getDestArray()).thenReturn(arrayEx);
        Location result = instance.getLoc(index);
        assertEquals(expResult.getName(), result.getName());
        assertArrayEquals(expResult.getDestArray(),result.getDestArray());
    }

    /**
     * Test of getLoc method, of class City.
     */
    @Test
    public void testGetLoc_String() {
        System.out.println("getLoc");
        String location = "Hotel";
        City instance = new City();
        Location expResult =mock(Location.class);
        when(expResult.getName()).thenReturn("Hotel");
        int[] arrayEx={1,-1,2, -1};
        when(expResult.getDestArray()).thenReturn(arrayEx);
        Location result = instance.getLoc(location);
        assertEquals(expResult.getName(), result.getName());
        assertArrayEquals(expResult.getDestArray(),result.getDestArray());
    }
    
}
