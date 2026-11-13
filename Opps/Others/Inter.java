
interface Animals {
    public void eat();

    public void walk();

}

class pig implements Animals {

    public void eat() {
        System.out.println("Pig will Eat : porky");
    }

    public void walk() {
    System.out.println("Monkey will Walk : slowely");
}

}



public class Inter {
    public static void main(String[] args) {

        pig obj1 = new pig();

        obj1.walk();

    }
}
