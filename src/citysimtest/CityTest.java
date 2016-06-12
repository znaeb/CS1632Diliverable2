/**
 * CityTest.java
 * @author Benjamin Nimchinsky
 * @author Michael Faller
 */

import org.junit.*;
import org.mockito.*;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

/**
 * Tests the City object
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
     * Test of getLocation method using a valid integer index of the location
     */
    @Test
    public void getLocationTestInt() {
        int index = 0;
        City instance = new City();
        Location expResult = Mockito.mock(Location.class);

        when(expResult.getName()).thenReturn("Hotel");

        int[] arrayEx= { 1, -1, 2, -1 };

        when(expResult.getDestinations()).thenReturn(arrayEx);

        Location result = instance.getLocation(index);

        assertEquals(expResult.getName(), result.getName());
        assertArrayEquals(expResult.getDestinations(), result.getDestinations());
    }

    /**
     * Tests getLocation throws an exception when using an out of bounds index of the location
     */
    @Test(expected=IndexOutOfBoundsException.class)
    public void getLocationTestIntOOB() {
        int index = -1;
        City instance = new City();

        Location result = instance.getLocation(index);
    }

    /**
     * Tests getLocation using a valid string name of the location
     */
    @Test
    public void getLocationTestString() {
        City city = new City();
        String location = "Hotel";
        int[] arrayEx = { 1, -1, 2, -1 };

        Location expResult = Mockito.mock(Location.class);
        when(expResult.getName()).thenReturn("Hotel");
        when(expResult.getDestinations()).thenReturn(arrayEx);

        Location result = city.getLocation(location);

        assertEquals(expResult.getName(), result.getName());
        assertArrayEquals(expResult.getDestinations(), result.getDestinations());
    }

    /**
     * Tests getLocation using an invalid string name of an unknown location
     */
    @Test
    public void getLocationTestStringInvalid() {
        City city = new City();
        String location = "DOES NOT EXIST";
        Location result = city.getLocation(location);

        assertNull(result);
    }
}