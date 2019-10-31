import java.time.Month;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

public class TodayMonth{
   
    public static void main(String[] args){
        
        //Date today = YearMonth.getInstance().getMonth();
        //public Month getMonth();
        LocalDate currentDate = LocalDate.now();
        Month m = currentDate.getMonth();
        System.out.println("This is the month of " + m + ".");
            
            
    }
}