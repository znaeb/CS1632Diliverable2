/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Benjamin
 */
public class Location {
    private static int maxLocs=5;
    static Location locArray[];

    /**
     * @return the maxLocs
     */
    public static int getMaxLocs() {
        return maxLocs;
    }
    private String name;
    private int[]destinations;
    //destinations[0] where fourth Ave. leads to from current.
    //destinations[1] is for fifth Ave.  destinations[2] is for Bill St. 
    // destinations[3] is for Phil St.
    //returns -1 for no path
    public Location(String nam,int fourth,int fifth,int bill, int phil){
        name=nam;
        destinations=new int[maxLocs];
        destinations[0]=fourth;
        destinations[2]=fifth;
        destinations[3]=bill;
        destinations[4]=phil;
    }
    public static Location[] getCity(){
        Location[] myCity=new Location[getMaxLocs()];
        myCity[0]=new Location("Hotel",1,-1,2, -1);
        myCity[1]=new Location("Diner",4,-1,-1, 3);
        myCity[2]=new Location("Library",-1,4,0, -1);
        myCity[3]=new Location("College",-1,2,-1, 1);
        myCity[4]=new Location("Outside City",0,3,-1, -1);
        return myCity;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @return the destinations
     */
    public int[] getDestArray() {
        return destinations;
    }
}
