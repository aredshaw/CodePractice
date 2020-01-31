public class DigitSum {

  int sum = 0;

  public static void main(String[] args) {
    sumDigits(25);

  }

  private static int sumDigits(int number) {
    if (number >= 100) {
      int x2 = number % 100;
      int y2 = (number - x2) / 100; //y2 is hundreds

      if (x2 >= 10) {
        int x = x2 % 10;
        int y = (x2 - x) / 10; // y is tens

        int x3 = number - (y2 * 100) - (y * 10); // x3 is ones

        int total = y2 + y + x3;
        System.out.println(total + " total");
        return y;
      }
    } else if ((number < 100) && (number >= 10)) {
      int x = number % 10;
      int y = (number - x) / 10;

      int x3 = number - (y * 10);

      int total = y + x3;
      System.out.println(total + " total");

      return y;

    } else if (number < 10) {
      return -1;
    }
    return number;
  }
}