/**
 * A City
 */
public class City {
    private Location[] city;

    /**
     * Default constructor
     */
    public City() {
        city = Location.getCity();
    }

    /**
     * Gets the Location at an index
     * @param index of location
     * @return location
     */
    public Location getLocation(int index) {
        return city[index];
    }

    /**
     * Gets the Location from a string
     * @param l location string
     * @return location
     */
    public Location getLocation(String l) {
        for (Location location : city) {
            if (location.getName().equalsIgnoreCase(l)) {
                return location;
            }
        }

        return null;
    }
}
