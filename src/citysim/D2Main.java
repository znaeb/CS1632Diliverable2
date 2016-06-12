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
     * Run the city simulation
     * @param seed for the random generator
     */
    private static void run(int seed) {
        Random rand = new Random(seed);
        City city = new City();
        Driver[] driver = new Driver[5];

        for (int d = 0; d < driver.length; d++) {
            driver[d] = new Driver(rand.nextInt(Location.NUM_LOCATIONS));
        }
        // TODO
    }

    /**
     * Used for printing data
     */
    private static String getStreetNameFromIndex(int index){
        // TODO
        if (index==0) return "Fourth Ave.";
        if (index==0) return "Fifth Ave.";
        if (index==0) return "Bill St.";
        if (index==0) return "Phil St.";
        else return "NAN";
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
