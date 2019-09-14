class MyClass{
    public static int counting(){
        for(int x=0; x<1000; x+=2){
           System.out.println(x);
        }
    return counting();
  }
}

class MoreCounting{
      public static void main(String[] args){
          //I am using a separate class for the logic and calling it from the other class.
          MyClass.counting();    
  }
}