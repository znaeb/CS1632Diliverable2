public class Driver {
    private int currentIndex;
    private City myCity;

    public Driver(int startIndex){
        currentIndex=startIndex;
    }
    
    
    public String getCurrentLocation(){
        return myCity.getLoc(currentIndex).getName();
    }
    public int getCurrentIndex(){
        return currentIndex;
    }
    
    public Boolean moveTo(int index){
        int[]dests=myCity.getCurrent(currentIndex).getDestArray();
        if(dests[index]>=0&&dests[index]<Location.getMaxLocs()){
            currentIndex=index;
            return true;
        }
        return false;
    }
    public Boolean moveTo(String destination){
        int[]dests=myCity.getCurrent(currentIndex).getDestArray();
        for (int i=0;i<Location.getMaxLocs();i++){
            if (destination.equalsIgnoreCase(myCity.getLoc(i).getName())){
                return moveTo(i);
            }
        }
        return false;
    }
}
