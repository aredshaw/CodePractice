interface Animals{
    public void make_sound();
    public void eat();
}

class Tiger implements Animals{
    public void make_sound(){
        System.out.println("Roarrr!");
    }
    public void eat(){
        System.out.println("Crunch, chew, chew\n");
    }
}

public class AnimalInterface{
    public static void main(String[] args){
        Tiger a = new Tiger();
        a.make_sound();
        a.eat();
        
        kitten b = new kitten();
        b.make_sound();
        b.eat();
    }
}

class kitten implements Animals{
    public void make_sound(){
        System.out.println("Meoooow!");
    }
    public void eat(){
        System.out.println("Slurp, slurp");
    }
}