abstract class Abstraction {
    public abstract void sound();

    public void sleep() {
        System.out.println("ZZzzzz......");
    }

}

class pig extends Abstraction {
    public void sound() {
        System.out.println("pei epeo peq peq.....");
    }

}

public class Innerpig {

    public static void main(String[] args) {
        pig obj = new pig();

        obj.sound();
        obj.sleep();
    }
}
