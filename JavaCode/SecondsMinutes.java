public class SecondsMinutes {
  public static void main(String[] args){
    getDurationString(125, 22);
    getDurationString(256);

  }
  private static String getDurationString(int minutes, int seconds){
    if ((minutes >= 0) || (seconds >=0)){
      if (minutes > 60){
        int hours = (minutes / 60);
        minutes = minutes%60;
        System.out.println(hours + "h " + minutes + "m " + seconds + "s");
      }
      else System.out.println(minutes + "m " + seconds + "s");
    }
      return "invalid value";

  }

  private static String getDurationString(int seconds){
    if (seconds >= 0){
      int minutes = seconds / 60;
      System.out.println(minutes + " minutes");
    }
    return "invalid string";
  }

}
