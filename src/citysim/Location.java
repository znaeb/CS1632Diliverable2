/**
 *
 * @author Benjamin
 */
public class Location {
    private String name;
    private int[] destinations;
    private static int maxLocations = 5;
    private static int streetCount = 4;

    /**
     * destinations[0] where fourth Ave. leads to from current
     * destinations[1] is for fifth Ave
     * destinations[2] is for Bill St
     * destinations[3] is for Phil St
     * the value is -1 if there is no path
     * @param n name
     * @param fourth
     * @param fifth
     * @param bill
     * @param phil
     */
    public Location(String n, int fourth, int fifth, int bill, int phil){
        name = n;
        destinations = new int[streetCount];
        destinations[0] = fourth;
        destinations[1] = fifth;
        destinations[2] = bill;
        destinations[3] = phil;
    }

    /**
     *
     * @return
     */
    public static Location[] getCity() {
        Location[] city = new Location[getMaxLocations()];

        city[0] = new Location("Hotel", 1, -1, 2, -1);
        city[1] = new Location("Diner", 4, -1, -1, 3);
        city[2] = new Location("Library", -1, 4, 0, -1);
        city[3] = new Location("College", -1, 2, -1, 1);
        city[4] = new Location("Outside City", 0, 3, -1, -1);

        return city;
    }

    /**
     *
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @return the destinations
     */
    public int[] getDestinations() {
        return destinations;
    }
    
    /**
     *
     * @return the maxLocations
     */
    public static int getMaxLocations() {
        return maxLocations;
    }

    /**
     *
     * @param l location
     * @return true if locations are equal
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
