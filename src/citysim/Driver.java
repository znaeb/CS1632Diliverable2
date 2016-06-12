/**
 *
 */
public class Driver {
    private int currentIndex;
    private City city;

    /**
     * Default constructor
     * @param startIndex
     */
    public Driver(int startIndex) {
        currentIndex = startIndex;
        city = new City();
    }
    
    /**
     * useful for printing the output
     * @return a string with the drivers currnet location's
     */
    public String getCurrentLocation() {
        return city.getLocation(currentIndex).getName();
    }
    
    /**
     * useful for getting data
     * @return int with the drivers currnet location's
     */
    public int getCurrentIndex() {
        return currentIndex;
    }
    
    /**
     * moves to a city with specified index
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
     * @return index of streed used, -1 if no move is made
     */
    public int moveTo(String destination) {
        for (int i = 0; i < Location.getMaxLocations(); i++) {
            if (destination.equalsIgnoreCase(city.getLocation(i).getName())) {
                return moveTo(i);
            }
        }

        return -1;
    }
}
