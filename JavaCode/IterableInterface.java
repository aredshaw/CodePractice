import java.util.*;

class FavoriteFoods{
    public static void main(String[] args){
        ArrayList<String> foods = new ArrayList<String>();
        foods.add("dal");
        foods.add("falafel");
        foods.add("veggie burger");
        foods.add("fresh cut veggies");
        foods.add("hummus");
        foods.add("olives");
        
        Iterator iterator = foods.iterator();
        
        System.out.println("Here are a few of my favorite foods:");
        while (iterator.hasNext())
          System.out.println(iterator.next());
          
        unhealthy();
        
        
        
    }
    
    public static void unhealthy(){
        ArrayList<String> badfoods = new ArrayList<String>();  
        badfoods.add("pizza");
        badfoods.add("burgers");
        badfoods.add("eggs");
        badfoods.add("bacon");
        
        Iterator iterator = badfoods.iterator();
        
        System.out.println("\nHere are some foods I cannot eat anymore:");
        while (iterator.hasNext())
          System.out.println(iterator.next());
        
        
    }
}