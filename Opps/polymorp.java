public class polymorp {

    public static class Animal {

        public void animal_sou() {
            System.out.println("this will make sound ");
        }

    }

    public static class dog extends Animal {
        public void animal_sou() {
            System.out.println("bark");
        }
    }

    public static class cow extends Animal {
        public void animal_sou() {
            System.out.println("Maa maa");
        }

    }

    public static void main(String[] args) {

        Animal obj = new Animal();
        cow obj1=new cow();

        obj.animal_sou();

        obj1.animal_sou();


    }

}
