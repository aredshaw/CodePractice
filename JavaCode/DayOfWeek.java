import java.util.Scanner;
import java.util.Calendar;
import java.text.DateFormatSymbols;


public class DayOfWeek{
    public static void main(String[] args){
        Scanner birth = new Scanner(System.in);
        System.out.println("How many years do you want to go back?\n");
        String input = birth.nextLine();
        
        int i = Integer.parseInt(input);
        
        Calendar calendar = Calendar.getInstance();
        
        calendar.add(Calendar.YEAR, - i);
        
        int weekday = calendar.get(Calendar.DAY_OF_WEEK);
        
        DateFormatSymbols dd = new DateFormatSymbols();
        String results = dd.getWeekdays()[weekday];
        System.out.println(i + " years ago, it was a " + results + ".");
    }
    
}
    
