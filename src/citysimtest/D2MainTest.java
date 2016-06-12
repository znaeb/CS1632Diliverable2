import org.junit.*;
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
    public void mainTest() {
        System.out.println("main");

        String[] args = { "23456789" };

        D2Main.main(args);
        // TODO review the generated test code and remove the default call to fail.
        //need to check for null pointers here
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getDriver method, of class D2Main.
     */
    /*
     not really testable...(if it is, I'm not sure how)
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
