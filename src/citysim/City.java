/**
 *
 */
public class City {
    private Location[] city = Location.getCity();

    /**
     *
     */
    public City() {
        city = Location.getCity();
    }

    /**
     * gets the Location at an index
     * @param index
     * @return
     */
    public Location getLocation(int index) {
        return city[index];
    }

    /**
     * gets the Location from a string
     * @param location
     * @return
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
