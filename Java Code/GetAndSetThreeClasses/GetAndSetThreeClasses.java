class GetAndSetThreeClasses{
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
        
        MoreDates.more();
    }
}



