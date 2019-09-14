class MyClass{
    static int adding(int x, int y){
        return x + y;
  }
}

class NumbersToAdd{
    static int numFive(int a){
        int fiver = a;//This is not used.
        return fiver;//Strangely enough, this is not used either.
    }
}

class ThreeClasses{
      public static void main(String[] args){
          int z = MyClass.adding(12, 5);//These numbers are added together because of MyClass.
          int num2 = NumbersToAdd.numFive(5);//This takes 5 from NumFive in NumbersToAdd.
          System.out.println(z+num2);//Now we add from the first MyClass.adding, and NumbersToAdd.numFive. It all gets printed out here, in the third class.
          

  }
}