import org.junit.*;
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
    public void getCurrentLocationTest() {
        System.out.println("getCurrentLocation");
        
        Driver driver = new Driver(0);

        String expResult = "Hotel";
        String result = driver.getCurrentLocation();

        assertEquals(expResult, result);
    }

    /**
     * Test of getCurrentIndex method, of class Driver.
     */
    @Test
    public void getCurrentIndexTest() {
        System.out.println("getCurrentIndex");

        Driver driver = new Driver(0);

        int expResult = 0;
        int result = driver.getCurrentIndex();

        assertEquals(expResult, result);
    }

    /**
     * Test of moveTo method, of class Driver.
     */
    @Test
    public void moveToTestInt() {
        System.out.println("moveTo");

        int index = 2;
        Driver driver = new Driver(0);

        int expResult = 2;
        int result = driver.moveTo(index);

        assertEquals(expResult, result);
        assertEquals(driver.getCurrentIndex(),2);

    }

    /**
     * Test of moveTo method, of class Driver.
     */
    @Test
    public void moveToTestString() {
        System.out.println("moveTo");

        String destination = "College";
        Driver driver = new Driver(0);

        int expResult = -1;
        int result = driver.moveTo(destination);

        assertEquals(expResult, result);

        destination = "Diner";
        expResult = 0;
        result = driver.moveTo(destination);

        assertEquals(expResult, result);
        assertEquals(driver.getCurrentLocation(),destination);
    }
    
}