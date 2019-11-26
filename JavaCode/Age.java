import java.util.Scanner;

public class Age{
public static void main(String[] args){
    Scanner age = new Scanner(System.in);
    System.out.println("How old are you?");
    
    String input = age.nextLine();
    int i = Integer.parseInt(input);
    i = i * 7;
    System.out.println("You are " + input + " years old.\nThat would be like " + i + " in dog years.");
    }
}
