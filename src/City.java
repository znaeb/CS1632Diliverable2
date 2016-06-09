
public class City {
    private Location[] myCity=Location.getCity();
    public City(){
        myCity=Location.getCity();
    }
    
    public Location getLoc(int index){
        return myCity[index];
    }
    public Location getLoc(String location){
        for (int i=0;i<myCity.length;i++){
            if (location.equalsIgnoreCase(myCity[i].getName())){
                return myCity[i];
            }
        }
        
        return null;
    }
    
}
