public class Casting{
    public static void main(String[] args){
        int a = 5;
        double b = 6.2;
        float c = 5.23832f;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        
        double wasint = a;
        int wasdouble = (int) b;
        long wasfloat = (long) c;
        
        System.out.println("\nSame as above, but type casted.\n");
        
        System.out.println(wasint);
        System.out.println(wasdouble);
        System.out.println(wasfloat);        
        
    }
}
