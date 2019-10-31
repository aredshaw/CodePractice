interface Car {
  public void appearance();
  public void sound();
  }
  
  class Honda implements Car{
    public void appearance(){
	  System.out.println("Ugly, and broken down");
	}
	public void sound(){
	    System.out.println("sputter, sputter, sputter");
	}
}

public class Program {
  public static void main(String[] args) {
    Honda a = new Honda();
	Honda b = new Honda();
	a.appearance();
	b.sound();
  }
 }