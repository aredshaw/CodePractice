/*Using a class and a method*/

class ClassMethod{
    static void message(String greeting){ //this is my method
        System.out.println("Hello " + greeting);
    }
    public static void main(String[] args){
        message("Amy"); //these are the parameters
        message("Joe");
        message("Dilbert");
    }
}