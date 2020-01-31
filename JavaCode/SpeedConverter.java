

//Udemy lesson 48 - More on methods and a challenge
public class SpeedConverter {

  public static void main(String[] args) {
    toMilesPerHour(15);
    printConversion(45);

  }

  public static double toMilesPerHour(double kilometersPerHour) {
    if (kilometersPerHour < 0) {
      return -1;
    } else if (kilometersPerHour >= 1) {
      double milesPerHour = kilometersPerHour * 1.609;
      return milesPerHour;
    }
    return kilometersPerHour;
  }

  public static void printConversion(double kilometersPerHour) {
    //System.out.println(kilometersPerHour + " km/h = " + milesPerHour + " mi/h");
    double milesPerHour = (long) (kilometersPerHour * 1.609);
    System.out.println(kilometersPerHour + " km/h = " + milesPerHour + " mi/h");
  }
}