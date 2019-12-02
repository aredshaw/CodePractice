public class Exceptions {
        
        static int div(int x, int y) throws ArithmeticException {
            if(y == 0){
                throw new ArithmeticException("Divided by zero");
            } 
            //If you don't want fractions smaller than 1
            else if(y > x) {
                throw new ArithmeticException("Nominator is smaller than denominator");
            }
            //If the two numbers cannot be the same for your program
            else if(y == x) {
                throw new ArithmeticException("Nominator and denominator are the same");
            }
            
            
            else {
                return x/y;
        }
    }
    public static void main(String[] args){
        System.out.println(div(4, 4));
    }
}
