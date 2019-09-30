//This is practice in using constructors
public class Const3{
    private String name;
    private int age;
    Const3(int y){
        this.setAge(y);

        }
    Const3(String x){
        this.setName(x);

        //this.setName("David");
        //System.out.println("Hello " + x);
    }
    public void setAge(int y){
        this.age = y;
    }
    
    public void setName(String x){
        this.name = x;
    }
    
    public int getAge(){
        return age;
    }
    
    public String getName(){
        return name;
    }
    }
//}


public class Const2{
    public static void main(String[] args){
        //notice that once I create an object, the constructor called automatically
        Const3 b = new Const3("David");
        System.out.println(b.getName());
        Const3 a = new Const3(16);
        System.out.println(a.getAge());
        System.out.println(b.getName() + " is " + a.getAge() + " years old.");
        
    }
}