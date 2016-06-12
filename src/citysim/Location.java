/**
 * A location
 */
public class Location {
    private String name;
    private int[] destinations;
    public static int MAX_LOCATIONS = 5;
    public static int STREET_COUNT = 4;

    /**
     * Creates a location.
     *   destinations[0] where fourth Ave. leads to from current
     *   destinations[1] is for fifth Ave
     *   destinations[2] is for Bill St
     *   destinations[3] is for Phil St
     *   the value is -1 if there is no path
     * @param n name
     * @param fourth destination[0]
     * @param fifth destination[1]
     * @param bill destination[2]
     * @param phil destination[3]
     */
    public Location(String n, int fourth, int fifth, int bill, int phil) {
        name = n;
        destinations = new int[STREET_COUNT];
        destinations[0] = fourth;
        destinations[1] = fifth;
        destinations[2] = bill;
        destinations[3] = phil;
    }

    /**
     * Gets the city
     * @return
     */
    public static Location[] getCity() {
        Location[] city = new Location[MAX_LOCATIONS];

        city[0] = new Location("Hotel", 1, -1, 2, -1);
        city[1] = new Location("Diner", 4, -1, -1, 3);
        city[2] = new Location("Library", -1, 4, 0, -1);
        city[3] = new Location("College", -1, 2, -1, 1);
        city[4] = new Location("Outside City", 0, 3, -1, -1);

        return city;
    }

    /**
     * Gets the name of the location
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * Get the destinations from a location
     * @return destinations
     */
    public int[] getDestinations() {
        return destinations;
    }

    /**
     * Determine if two locations are equal
     * @param l location to compare
     * @return true if this and l are equal
     */
    public Boolean equals(Location l) {
        Boolean equal;

        equal = name.equalsIgnoreCase(l.getName());

        if (destinations.length == l.destinations.length) {
            for (int i = 0; i < destinations.length; i++) {
                equal = destinations[i] == l.destinations[i];
            }
        } else  {
            equal = false;
        }

        return equal;
    }
}
