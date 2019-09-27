import java.util.LinkedList;

class Listing{
    public static void nums(){
        LinkedList<Integer> num1 = new LinkedList<Integer>();
            num1.add(12);
            num1.add(15);
            num1.add(2);
            num1.add(16);
            num1.remove(2);
            num1.add(24);
            num1.add(12);//You can have more than one of an item in a LinkedList
            num1.add(62);
            num1.add(43);
            num1.add(72);
            num1.add(64);
            num1.add(55);
        for(int x: num1){
            System.out.println(x);
            
        }
    }
}

public class AccessingLinkedList{
    public static void main(String[] args){
        Listing a = new Listing();//Creating an object so I can access the method above
        a.nums();
    }
}
