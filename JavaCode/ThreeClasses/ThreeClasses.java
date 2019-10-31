class ThreeClasses{
      public static void main(String[] args){
          int z = MyClass.adding(12, 5);//These numbers are added together because of MyClass.
          int num2 = NumbersToAdd.numFive(5);//This takes 5 from NumFive in NumbersToAdd.
          System.out.println(z+num2);//Now we add from the first MyClass.adding, and NumbersToAdd.numFive. It all gets printed out here, in the third class.
          

  }
}
