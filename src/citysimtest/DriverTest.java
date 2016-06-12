import org.junit.*;
import org.mockito.*;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

/**
 * Tests a Driver object
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
     * Test of getLocation method, of class Driver.
     */
    @Test
    public void getLocationTest() {
        Driver driver = new Driver(0);

        String expResult = "Hotel";
        String result = driver.getLocation();

        assertEquals(expResult, result);
    }

    /**
     * Test of getIndex method, of class Driver.
     */
    @Test
    public void getLocationIndexTest() {
        Driver driver = new Driver(0);

        int expResult = 0;
        int result = driver.getLocationIndex();

        assertEquals(expResult, result);
    }

    /**
     * Test of moveTo method, of class Driver.
     */
    @Test
    public void moveToTestInt() {
        int index = 2;
        Driver driver = new Driver(0);

        int expResult = 2;
        int result = driver.moveTo(index);

        assertEquals(expResult, result);
        assertEquals(driver.getLocationIndex(),2);

    }

    /**
     * Test of moveTo method, of class Driver.
     */
    @Test
    public void moveToTestString() {
        String destination = "College";
        Driver driver = new Driver(0);

        int expResult = -1;
        int result = driver.moveTo(destination);

        assertEquals(expResult, result);

        destination = "Diner";
        expResult = 0;
        result = driver.moveTo(destination);

        assertEquals(expResult, result);
        assertEquals(driver.getLocation(),destination);
    }
}
