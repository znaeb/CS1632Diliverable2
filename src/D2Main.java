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
    
    //makes
    public static Driver getDriver(){
        Random rand=new Random();
        rand.setSeed(seed);
        return new Driver(rand.nextInt(locationCount));
        
    }
}
