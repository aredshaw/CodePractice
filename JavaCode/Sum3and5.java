public class Sum3and5 {

  public static void main(String[] args) {
    int sum1 = 0;
    int sum2 = 0;
    int count = 0;

    for (int i = 1; i <= 1000; i++) {

      if ((i % 3 == 0) && (i % 5 == 0)) {
        System.out.println(i);
        sum1 = sum1 + i;
        count ++;
        if (count >= 5){
          break;
        }

      }

    }
    int total = sum1 + sum2;
    System.out.println("\n" + "The total is " + total);

  }

}
