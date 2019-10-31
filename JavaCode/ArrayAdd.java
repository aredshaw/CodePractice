//The easiest way to add numbers in an array

class ArrayAdd{
    public static void main(String[] args){
        int x = 0;
        int[] arr = {2, 5, 4, 7, 8, 5, 10, 1, 13};
        for(int a: arr){
            x += a;
        }
        System.out.println(x);
    }
}