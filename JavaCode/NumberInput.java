import java.util.Scanner;

public class NumberInput {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter your age");
    int yourAge = scanner.nextInt();
    scanner.nextLine();

    System.out.println("Enter your name");
    String yourName = scanner.nextLine();
    System.out.println("Your name is " + yourName + ". and your age is " + yourAge);

    int yearOfBirth = 2020 - yourAge;
    System.out.println("You were born around " + yearOfBirth);

    scanner.close();
  }
}
