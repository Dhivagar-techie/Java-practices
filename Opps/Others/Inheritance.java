public class Inheritance {

    public static class cat {

        int legs = 4;

        static void walk() {
            System.out.println("it can walk");
        }

        static void eat() {
            System.out.println("it eat meat");
        }

    }

    public static class cetha extends cat {

        static void speed() {
            System.out.println("it was the fastest");
        }

    }

    public static void main(String[] args) {

        cetha obj=new cetha();

        cat obj1=new cat();


        obj.walk();

        obj1.eat();

        

    }


    
}
