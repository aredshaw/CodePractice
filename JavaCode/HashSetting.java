import java.util.HashSet;
import java.util.*;

class Hash1{
    public static void hasher(){
        HashSet<Integer> nums = new HashSet<Integer>();
            nums.add(23);
            nums.add(62);
            nums.add(44);
            nums.add(96);
            nums.add(65);
            nums.add(88);
            nums.remove(44);
            nums.remove(65);
            nums.add(98);
            nums.add(25);
        System.out.println(nums);
        System.out.println("There are " + nums.size() + " numbers in this HashSet.");
    }
}

public class HashSetting{
    public static void main(String[] args){
        Hash1 a = new Hash1();
        a.hasher();
    }
}
