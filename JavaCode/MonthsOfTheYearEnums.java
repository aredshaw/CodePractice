public class MonthsOfTheYearEnums{
    public enum Month {
        JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE, JULY, AUGUST, SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER
    }
    public static void main(String[] args){
        String mess1 = "This is the month of ";
        
        Month now = Month.SEPTEMBER;
        
        switch(now){
            case JANUARY:
                System.out.println(mess1 + "January.");
                break;
            case FEBRUARY:
                System.out.println(mess1 + "February.");
                break;
            case MARCH:
                System.out.println(mess1 + "March.");
                break;
            case APRIL:
                System.out.println(mess1 + "April.");
                break;
            case MAY:
                System.out.println(mess1 + "May.");
                break;
            case JUNE:
                System.out.println(mess1 + "June.");
                break;
            case JULY:
                System.out.println(mess1 + "July.");
                break;
            case AUGUST:
                System.out.println(mess1 + "August.");
                break;
            case SEPTEMBER:
                System.out.println(mess1 + "September.");
                break;
            case OCTOBER:
                System.out.println(mess1 + "October.");
                break;
            case NOVEMBER:
                System.out.println(mess1 + "November.");
                break;
            case DECEMBER:
                System.out.println(mess1 + "December");
                break;
            
            
        }
    }
}