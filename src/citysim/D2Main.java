import java.util.Random;

/**
 * Deliverable 2
 *
 * Usage:
 * java D2Main <seed>
 */
public class D2Main {
    private static int seed;

    /**
     * Main
     * @param args seed
     */
    public static void main(String[] args) {
        try {
            seed = Integer.parseInt(args[0]);
        } catch (Exception e) {
            System.out.println("Usage:\njava D2Main <seed>");
            System.exit(1);
        }

        City city = new City();
    }

    /**
     * Makes a random Driver
     * @return driver
     */
    public static Driver getDriver() {
        Random rand = new Random(seed);

        return new Driver(rand.nextInt(Location.MAX_LOCATIONS));
    }

    /**
     * Used for printing data
     */
    public static String getStreetNameFromIndex(int index){
        if (index==0) return "Fourth Ave.";
        if (index==0) return "Fifth Ave.";
        if (index==0) return "Bill St.";
        if (index==0) return "Phil St.";
        else return "NAN";
    }
}
