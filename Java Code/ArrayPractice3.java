class ArrayPractice3{
    public static void main(String[] args){
        String[] Arr = {"A", "B", "C", "D"};
        System.out.println("The second element of the array is " + Arr[1] + ".");
        
        Integer[] num = {2, 4, 3, 6, 8, 1};
        int mult = num[0]*num[4];
        System.out.println("The first array element * the fourth element = " + mult);
        num[0] = 6;
        System.out.println(num[0]);
        System.out.println(num[1]);//I see that adding 6 to num[0], replaced it rather than added it.
        System.out.println("It is clear that I replaced, rather than added to the array.");
        }
}