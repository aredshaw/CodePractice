import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Regex1 {
    public static void main(String[] args){
        Pattern pattern = Pattern.compile("Hel*");
        String x = "Hello there!";
        Matcher matcher = pattern.matcher(x);
        
        System.out.println("You were looking for " + pattern + " in \"" + x + "\"");
        System.out.println("Here are your results:");
        System.out.println(matcher);
        System.out.println("\nNot very human readable, is it?");
        
    }
}
