import java.util.LinkedList;
import java.util.Iterator;

public class Iterator1
{
	public static void main(String[] args) {
	    LinkedList<String> names = new LinkedList<String>();
	    names.add ("Joe");
	    names.add ("Harold");
	    names.add ("Hector");
	    names.remove ("Joe");
	    names.add ("Susan");
	    names.add ("Mandeep");
	    names.add ("Phoebe");
	    
	   
	    Iterator<String> namer = names.iterator();
	    for (int i=0; i<=4; i++) {
	    String value = namer.next();
	    
		System.out.println(value);
	    }
	}
}