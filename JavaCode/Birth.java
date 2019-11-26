import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Birth{
    public static void main(String[] args)throws Exception{
        Scanner birth = new Scanner(System.in);
        System.out.println("What is your birthdate? dd/MM/yyyy\n");
        String input = birth.nextLine();
        
        String sDate1=input;
        Date date1 = new SimpleDateFormat("MM/dd/yyyy").parse(sDate1);
        //System.out.println(date1);
        
        String strDateFormat = "E";
        SimpleDateFormat sdf = new SimpleDateFormat(strDateFormat);
        
        strDateFormat = "EEEE";
        sdf = new SimpleDateFormat(strDateFormat);
        System.out.println("You were born on a " + sdf.format(date1));

    }
    
}
