/*
Class 1 - It seems you can have several classes in the same program and they will all work together. But this is probably bad programming practice since you cannot work on classes independent of each other. It makes sense that you would want each class to be a separate file for object oriented programming.
*/
class Program extends Thread {
    public void bark() {
        System.out.println("Bow wow!");
    }
}

//Class 2
class Puppy extends Thread {
    public void bark() {
        System.out.println("Arf arf!");
    }
}


//Class 3 - The only public class
public class Dog
{
	public static void main(String[] args) {
	    Program c = new Program();
	    c.bark();
	    Puppy t = new Puppy();
	    t.bark();
		
	}
}