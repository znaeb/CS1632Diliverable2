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

        assertEquals(driver.getLocation(), "Hotel");
    }

    /**
     * Tests getLocationIndex returns null when the driver has an invalid location index
     */
    @Test
    public void getLocationTestInvalidStartIndex() {
        Driver driver = new Driver(-1);

        assertNull(driver.getLocation());
    }

    /**
     * Tests getLocationIndex returns the expected index
     */
    @Test
    public void getLocationIndexTest() {
        Driver driver = new Driver(0);

        assertEquals(driver.getLocationIndex(), 0);
    }

    /**
     * Tests moveTo moves the driver to the specified int index
     */
    @Test
    public void moveToTestInt() {
        Driver driver = new Driver(0);
        int index = 2;

        assertEquals(driver.moveTo(index), 2);
        assertEquals(driver.getLocationIndex(), 2);

    }

    /**
     * Tests moveTo moves the driver to the specified location name
     */
    @Test
    public void moveToTestString() {
        Driver driver = new Driver(0);
        String destination = "College";

        assertEquals(driver.moveTo(destination), -1);

        destination = "Diner";

        assertEquals(driver.moveTo(destination), 0);
        assertEquals(driver.getLocation(), destination);
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

        assertEquals(driver1.moveTo(destination), driver2.moveTo(destination));
    }
}