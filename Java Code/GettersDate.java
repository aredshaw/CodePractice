class UsingGetters{
    private int day = 24;
    private String month = "September";
    private int year = 2019;
    
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

class GettersDate{
    public static void main(String[] args){
        UsingGetters now = new UsingGetters();
        
        System.out.println("The current month is " + now.getMonth() + ".");
        System.out.println("In fact, it is " + now.getMonth() + " " + now.getDay() + ", " + now.getYear() + ".");
    }
}

