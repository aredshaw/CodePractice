import java.util.ArrayList;

public class ArrayList1
{
	public static void main(String[] args) {
	    ArrayList<String> friends = new ArrayList<String>(3); //the 3 is the initial size. It will grow though.
	    
		friends.add("Aneesh");
		friends.add("Jayati");
		friends.add("Allen");
		friends.remove("Jayati"); //she should be under the boss category
		friends.add("Grant");
		friends.add("Hector");
		
		System.out.println(friends.get(2)); //print the third person
		System.out.println(friends.size()); //remember, I removed one
		System.out.println(friends.contains("Aneesh")); //true or false. Is he one of my friends?
		System.out.println(friends); //print all of my friends
	}
}