import org.junit.*;
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
     * Test of getLocation method, of class City.
     */
    @Test
    public void getLocationTestInt() {
        int index = 0;
        City instance = new City();
        Location expResult = mock(Location.class);

        when(expResult.getName()).thenReturn("Hotel");

        int[] arrayEx= { 1, -1, 2, -1 };

        when(expResult.getDestinations()).thenReturn(arrayEx);

        Location result = instance.getLocation(index);

        assertEquals(expResult.getName(), result.getName());
        assertArrayEquals(expResult.getDestinations(), result.getDestinations());
    }

    /**
     * Test of getLocation method, of class City.
     */
    @Test
    public void getLocationTestString() {
        String location = "Hotel";
        City city = new City();
        Location expResult = mock(Location.class);

        when(expResult.getName()).thenReturn("Hotel");

        int[] arrayEx = { 1, -1, 2, -1 };

        when(expResult.getDestinations()).thenReturn(arrayEx);

        Location result = city.getLocation(location);

        assertEquals(expResult.getName(), result.getName());
        assertArrayEquals(expResult.getDestinations(), result.getDestinations());
    }
}
