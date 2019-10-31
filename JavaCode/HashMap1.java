import java.util.HashMap;

public class HashMap1
{
public static void main(String[] args) {

    
 HashMap<String, String> dates = new HashMap<String, String>();
     dates.put("Monday", "dancing");
     dates.put("Tuesday", "walking");
     dates.put("Wednesday", "kissing");

    
	System.out.println(dates.get("Wednesday"));
	}
}