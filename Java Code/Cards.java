public class Cards {
    enum Deck{
        ACE,
        KING,
        QUEEN,
        JACK,
        TEN
    }

  public static void main(String[] args) {
    Deck c = Deck.TEN;
    switch(c){
                case ACE:
            System.out.println("You won!");
        break;
                case KING:
            System.out.println("You won!");
        break;
                case QUEEN:
            System.out.println("You won!");
        break;
                case JACK:
            System.out.println("You won!");
        break;
                case TEN:
            System.out.println("You lost!");
        break;
    }
        
  }
		
}