import java.util.HashMap;



class CarMileage{
    
    public static void miles(){
        HashMap<String, Integer> mileage = new HashMap<String, Integer>();
            mileage.put("Honda", 12435);
            mileage.put("Hyundai", 64266);
            mileage.put("Ford", 12482);
            mileage.put("Toyota", 164335);
            mileage.remove("Hyundai");
            mileage.put("Mercury", 21685);
            mileage.put("Saturn", 264016);
            mileage.remove("Mercury");
            mileage.put("Tesla", 61200);
            
        
        System.out.print(mileage + "\n");
        System.out.println("The Ford has " + mileage.get("Ford") + " on it.");
        
    
    }
}

public class HashMapping{
    public static void main(String[] args){
        CarMileage a = new CarMileage();
        a.miles();
        
    }
}
