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
public class D2MainTest {
    
    public D2MainTest() {
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
     * Test of main method, of class D2Main.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = {"23456789"};
        D2Main.main(args);
        // TODO review the generated test code and remove the default call to fail.
        //need to check for null pointers here
        //fail("The test case is a prototype.");
    }

    
    /**not really testable...(if it is, I'm not sure how)
     * Test of getDriver method, of class D2Main.
     *
    @Test
    public void testGetDriver() {
        System.out.println("getDriver");
        Driver expResult = null;
        Driver result = D2Main.getDriver();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    */
}
