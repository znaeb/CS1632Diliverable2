/**
 * DriverTest.java
 * @author Benjamin Nimchinsky
 * @author Michael Faller
 */

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
     * Tests getLocation returns the correct String using a specified starting index
     */
    @Test
    public void getLocationTest() {
        Driver driver = new Driver(0);

        String expResult = "Hotel";
        String result = driver.getLocation();

        assertEquals(expResult, result);
    }

    /**
     * Tests getLocationIndex returns the expected index
     */
    @Test
    public void getLocationIndexTest() {
        Driver driver = new Driver(0);

        int expResult = 0;
        int result = driver.getLocationIndex();

        assertEquals(expResult, result);
    }

    /**
     * Tests moveTo moves the driver to the specified int index
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
     * Tests moveTo moves the driver to the specified location name
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

    /**
     * Tests moveTo returns -1 when an invalid destination is tried
     */
    @Test
    public void moveToTestStringMocked() {
        String destination = "DOES NOT EXIST";
        Driver driver1 = new Driver(0);
        Driver driver2 = mock(Driver.class);

        when(driver2.moveTo(destination)).thenReturn(-1);

        int result = driver1.moveTo(destination);
        int expResult = driver2.moveTo(destination);

        assertEquals(expResult, result);
    }
}
