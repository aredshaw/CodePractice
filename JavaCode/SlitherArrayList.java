import java.util.ArrayList;

public class SlitherArrayList{
    public static void main(String[] args){
        ArrayList <String> slither = new ArrayList<String>();
            slither.add("boa constrictor");
            slither.add("python");
            slither.add("garter snake");
            slither.add("king cobra");
        System.out.println("The original LinkedList is..." + slither);
            slither.remove("garter snake");
        System.out.println("I just removed gater snake..." + slither);
            
        System.out.println("Index 0 is " + slither.get(0));
        System.out.println("Index 2 is " + slither.get(2));
        System.out.println("Does this LinkedList contain a python? " + slither.contains("python"));
        System.out.println("The size of this LinkedList is " + slither.size());
    }
}