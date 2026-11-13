public class pract16 {
    public static void main(String[] args) {
        cat c1 = new cat();
        c1.behaviour();
        c1.eat();
        c1.sleep();

        dog d1 = new dog();
        d1.behaviour();
        d1.eat();
        d1.sleep();
    }

}

class Animal {
    void behaviour() {
        System.out.println("rouming somevare");
    }
}

class cat extends Animal {
    void eat() {
        System.out.println("cats will eat things");
    }

    void sleep() {
        System.out.println("cats will sleep");
    }
}

class dog extends Animal {
    void eat() {
        System.out.println("dogs will eat things");
    }

    void sleep() {
        System.out.println("dogs will sleep");
    }
}