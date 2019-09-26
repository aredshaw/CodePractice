class Program extends Thread {
    public void run() {
        System.out.println("vroom vroom!");
    }
}

class Truck extends Thread {
    public void run() {
        System.out.println("clink clink clink");
    }
}



public class Car2
{
	public static void main(String[] args) {
	    Program c = new Program();
	    c.start();
	    Truck t = new Truck();
	    t.start();
		
	}
}
