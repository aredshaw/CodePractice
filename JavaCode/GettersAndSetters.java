class UsingGetters{
    
    private int day;
    private String month;
    private int year;
    
    public void setDay(int day){
        this.day = day;
    }
    public int getDay(){
        return day;
    }
    public void setMonth(String month){
        this.month = month;
    }
    public String getMonth(){
        return month;
    }
    public void setYear(int year){
        this.year = year;
    }
    public int getYear(){
        return year;
    }
}

class GettersAndSetters{
    public static void main(String[] args){
        UsingGetters now = new UsingGetters();
        //setting the date
        now.setDay(24);
        now.setMonth("September");
        now.setYear(2019);
        
        System.out.println("The current month is " + now.getMonth() + ".\n");
        System.out.println("In fact, it is " + now.getMonth() + " " + now.getDay() + ", " + now.getYear() + ".");
        
        //using math to add to the day.
        int tomorrow = now.getDay() + 1;
        System.out.println("But tomorrow it will be " + now.getMonth() + " " + tomorrow + ", " + now.getYear() + ".");
        
        //using a setter to change the day.
        now.setDay(26);
        System.out.println("The day after that, it will be  " + now.getMonth() + " " + now.getDay() + ", " + now.getYear() + ".");
    }
}


