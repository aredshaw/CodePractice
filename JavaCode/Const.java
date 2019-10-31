//This is practice in using constructors
class Const2{
    Const2(){
        for(int i=0; i<100; i++){
            System.out.println(i);
        }
    }
}

public class Const{
    public static void main(String[] args){
        //notice that once I create an object, the constructor called automatically
        Const2 a = new Const2();
    }
}