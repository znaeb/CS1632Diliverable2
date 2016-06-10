import java.util.Random;
/**
 *
 * @author Benjamin
 */
public class D2Main {
    static int seed;
    static int locationCount=Location.getMaxLocs();
    
    public static void main(String[] args) {
        seed=Integer.parseInt(args[0]);
        City myCity;
    }
    
    //makes a Random Driver
    public static Driver getDriver(){
        Random rand=new Random();
        rand.setSeed(seed);
        return new Driver(rand.nextInt(locationCount));
        
    }
    
    //used for printing data
    public static String getStreetNameFromIndex(int index){
        if (index==0) return "Fourth Ave.";
        if (index==0) return "Fifth Ave.";
        if (index==0) return "Bill St.";
        if (index==0) return "Phil St.";
        else return "NAN";
    }
}
