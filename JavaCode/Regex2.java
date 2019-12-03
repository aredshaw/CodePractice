import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Regex2 {
    public static void main(String[] args){
        String str = "Hello out there, all the world!";
        String reg = "[c-h]";
        Pattern pattern = Pattern.compile(reg);
        Matcher matcher = pattern.matcher(str);
        
        System.out.println("You were looking for \"" + reg + "\" in \"" + str + "\"");
        if (matcher.find()){
            System.out.println("The first found letter is \"" + matcher.group(0) + ".\"");
        }
        
    }
}
