class Car2 extends Thread {
    public void run() {
        System.out.println("vroom vroom!");
    }
}

class Truck extends Thread {
    public void run() {
        System.out.println("clink clink clink");
    }
}



public class Program
{
	public static void main(String[] args) {
	    Car2 c = new Car2();
	    c.start();
	    Truck t = new Truck();
	    t.start();
		
	}
}