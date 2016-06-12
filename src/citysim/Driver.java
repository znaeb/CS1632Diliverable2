/**
 * Driver.java
 * @author Benjamin Nimchinsky
 * @author Michael Faller
 */

/**
 * A driver
 */
public class Driver {
    private int currentIndex;
    private City city;

    /**
     * Default constructor
     * @param index starting index
     */
    public Driver(int index) {
        currentIndex = index;
        city = new City();
    }
    
    /**
     * Useful for printing the output
     * @return a string with the driver's current locations
     */
    public String getLocation() {
        String result = null;

        if (currentIndex >= 0 && currentIndex <= Location.NUM_LOCATIONS) {
            result = city.getLocation(currentIndex).getName();
        }

        return result;
    }
    
    /**
     * Useful for getting data
     * @return int with the driver's current location
     */
    public int getLocationIndex() {
        return currentIndex;
    }
    
    /**
     * Moves to a location with specified index
     * @param index an int
     * @return index of street used, -1 if no move is made
     */
    public int moveTo(int index) {
        int[] destinations = city.getLocation(currentIndex).getDestinations();

        for (int i = 0; i < destinations.length; i++) {
            if (destinations[i] == index) {
                currentIndex = index;
                return i;
            }
        }

        return -1;
    }
    
    /**
     * Moves to a city with a specified destination
     * @param destination a String
     * @return index of street used, -1 if no move is made
     */
    public int moveTo(String destination) {
        for (int i = 0; i < Location.NUM_LOCATIONS; i++) {
            if (destination.equalsIgnoreCase(city.getLocation(i).getName())) {
                return moveTo(i);
            }
        }

        return -1;
    }
}