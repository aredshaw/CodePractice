public class Main {

  public static void main(String[] args){
    Programmer Bob = new Programmer(4, 2, 9);
    System.out.println("Bob, the programmer, gets " + Bob.getSleepHours() + " hours of sleep per night and has a caffeine level of " + Bob.getCaffeine() + ".");

    Gamer Henry = new Gamer(3, 6, true);
    System.out.println("Henry, the gamer, gets " + Henry.getSleepHours() + " hours of sleep per night and has a social skills level of " + Henry.getSocialSkills());
  }
}
