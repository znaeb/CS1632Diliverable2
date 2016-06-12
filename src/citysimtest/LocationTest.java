/**
 * LocationTest.java
 * @author Benjamin Nimchinsky
 * @author Michael Faller
 */

import org.junit.*;
import org.mockito.*;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

/**
 * Tests the Location object
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
     * Test of getCity method for the default city, of class Location.
     */
    @Test
    public void getCityTest() {
        Location[] expResult = new Location[5];

        expResult[0] = new Location("Hotel", 1, -1, 2, -1);
        expResult[1] = new Location("Diner", 4, -1, -1, 3);
        expResult[2] = new Location("Library", -1, 4, 0, -1);
        expResult[3] = new Location("College", -1, 2, -1, 1);
        expResult[4] = new Location("Outside City", 0, 3, -1, -1);

        Location[] result = Location.getCity();

        for (int i = 0; i < 5; i++) {
            assert(expResult[i].equals(result[i]));
        }
    }

    /**
     * Test of getName method, of class Location.
     */
    @Test
    public void getNameTest() {
        Location instance = new Location("Hotel", 0, 3, -1, -1);

        String expResult = "Hotel";
        String result = instance.getName();

        assertEquals(expResult, result);
    }

    /**
     * Test of getDestinations method, of class Location.
     */
    @Test
    public void getDestinationsTest() {
        Location location = new Location("Hotel", 0, 3, -1, -1);

        int[] expResult =  new int[] { 0, 3, -1, -1 };
        int[] result = location.getDestinations();

        assertArrayEquals(expResult, result);
    }

    /**
     * Test of getDestinations method, of class Location, using a filled city
     */
    @Test
    public void getDestinationsTestGetCity() {
        Location[] city;
        Location location;
        int[] expResult;
        int[] result;

        city = Location.getCity();

        location = city[0];
        expResult = new int[] { 1, -1, 2, -1 };
        result = location.getDestinations();
        assertArrayEquals(expResult, result);

        location = city[1];
        expResult = new int[] { 4 , -1, -1, 3 };
        result = location.getDestinations();
        assertArrayEquals(expResult, result);

        location = city[2];
        expResult = new int[] { -1, 4, 0, -1 };
        result = location.getDestinations();
        assertArrayEquals(expResult, result);

        location = city[3];
        expResult = new int[] { -1, 2, -1, 1 };
        result = location.getDestinations();
        assertArrayEquals(expResult, result);

        location = city[4];
        expResult = new int[] { 0, 3, -1, -1 };
        result = location.getDestinations();
        assertArrayEquals(expResult, result);
    }
}
