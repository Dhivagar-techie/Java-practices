public class pract15 {
    public static void main(String[] args) {

        son s1=new son();
        s1.grand_property();

    }

}

class Grandfather {
    void grand_property() {
        System.out.println("owns a villa");
    }
}

class father extends Grandfather {
    void father_property() {
        System.out.println("owns a cars");
    }
}

class son extends father {
    void son_property() {
        System.out.println("owns a nothing");
    }
}
