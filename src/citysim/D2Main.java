/**
 * D2Main.java
 * @author Benjamin Nimchinsky
 * @author Michael Faller
 */

import java.util.Random;

/**
 * Deliverable 2
 * Usage: java D2Main <seed>
 */
public class D2Main {

    /**
     * Main
     * @param args seed
     */
    public static void main(String[] args) {
        try { // run the simulation
            if (args.length != 1) { // check number of arguments
                usage(new Exception("Invalid argument(s)"));
            }
            run(Integer.parseInt(args[0]));
        } catch (Exception e) { // exit if args cannot be parsed
            usage(new Exception("Invalid argument: \"" + args[0] + "\""));
        }
    }

    /**
     * Run the city simulation for 5 drivers
     * @param seed for the random generator
     */
    private static void run(int seed) {
        Random rand = new Random(seed);
        City city = new City();
        String location;
        int street;
        int[] destinations;

        for (int d = 0; d < 5; d++) { // iterate through 5 drivers
            Driver driver = new Driver(rand.nextInt(Location.NUM_LOCATIONS)); // choose random starting location

            location = driver.getLocation();
            if (location.equals("Outside City")) { // choose to go to College (via Fifth Ave) or Hotel (via Fourth Ave)
                if (rand.nextBoolean()) {
                    street = driver.moveTo("College");
                } else {
                    street = driver.moveTo("Hotel");
                }
                print(d, location, driver.getLocation(), getStreet(street));
            }

            do { // driver randomly goes to a new location until outside city
                int randDestination;

                location = driver.getLocation();
                destinations = city.getLocation(driver.getLocationIndex()).getDestinations(); // possible destinations

                do { // choose a valid random destination connected to the current location and go there
                    randDestination = rand.nextInt(Location.NUM_STREETS);
                } while (destinations[randDestination] == -1);
                street = driver.moveTo(destinations[randDestination]);

                print(d, location, driver.getLocation(), getStreet(street));
            } while (!driver.getLocation().equals("Outside City"));

            System.out.println("-----"); // end of this drivers turn
        }
    }

    /**
     * Print driver's movement
     * @param d driver number
     * @param location1 initial location
     * @param location2 destination location
     * @param street used to travel
     */
    private static void print(int d, String location1, String location2, String street) {
        System.out.println("Driver " + d + " heading from " + location1 + " to " + location2 + " via " + street);

        if (location2.equals("Outside City")) {
            String city;

            if (street.equals("Fourth Ave.")) {
                city = "Philadelphia";
            } else {
                city = "Cleveland";
            }

            System.out.println("Driver has gone to " + city + "!");
        }
    }

    /**
     * Translates street index to street name
     * @param index return value from Driver.moveTo()
     */
    private static String getStreet(int index) {
        String result;

        switch (index) {
            case 0:
                result = "Fourth Ave.";
                break;
            case 1:
                result = "Fifth Ave.";
                break;
            case 2:
                result = "Bill St.";
                break;
            case 3:
                result = "Phil St.";
                break;
            default:
                result = "NAN";
        }

        return result;
    }

    /**
     * Prints the usage for the program and exits
     * @param e exception
     */
    private static void usage(Exception e) {
        if (e != null) { // print exception message if it exists
            System.out.println(e.getMessage());
        }

        System.out.println("Usage: java D2Main <seed>");
        System.exit(1);
    }
}
