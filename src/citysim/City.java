/**
 * A City
 */
public class City {
    private Location[] city = Location.getCity();

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
     * @param location string
     * @return location
     */
    public Location getLocation(String location) {
        for (int i = 0; i < city.length; i++) {
            if (location.equalsIgnoreCase(city[i].getName())) {
                return city[i];
            }
        }

        return null;
    }
}
