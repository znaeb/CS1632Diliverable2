public class Driver {
    private int currentIndex;
    private City myCity;

    public Driver(int startIndex){
        currentIndex=startIndex;
        myCity=new City();
    }
    
    
    public String getCurrentLocation(){
        return myCity.getLoc(currentIndex).getName();
    }
    public int getCurrentIndex(){
        return currentIndex;
    }
    
    //moves to a city with index 'index' and returns index of street used,
    //returns -1 if no move is made
    public int moveTo(int index){
        int[]dests=myCity.getLoc(currentIndex).getDestArray();
        for (int i=0;i<dests.length;i++){
            if(dests[i]==index){
                currentIndex=index;
                return i;
            }
        }
        return -1;
    }
    
    //moves to a city with index 'index' and returns index of street used,
    //returns -1 if no move is made
    public int moveTo(String destination){
        //int[]dests=myCity.getLoc(currentIndex).getDestArray();
        for (int i=0;i<Location.getMaxLocs();i++){
            if (destination.equalsIgnoreCase(myCity.getLoc(i).getName())){
                return moveTo(i);
            }
        }
        return -1;
    }
}
