public class RandNum{
    public static void main(String[] args){
        double rand = (Math.random() + .1) * 10;
        int round = (int) Math.round(rand);
        
        System.out.println("Your random number between 1-10 is " + round + ".");
    }
}
