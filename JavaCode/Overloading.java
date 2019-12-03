class Overloading {
    static int total(int a, int b){
        if(a + b > 5){
            return a + b;
        }
        else {
            return 5;
        }
    }
    //Notice we are using the same method name, but with different parameters
    static int total(int a, int b, int c){
        if(a + b > c){
            return a + b;
        }
        else {
            return c;
        }
    }
    
    
    
    public static void main(String[] args){
        System.out.println(total(1, 2));
        System.out.println(total(3, 4, 5));
    }
}
