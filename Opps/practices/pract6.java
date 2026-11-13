public class pract6 {

    public static void main(String[] args) {

        Anauall ani = new Anauall();

        System.out.println(ani.AnuallSal(20));

    }
}

class Anauall {

    int AnuallSal(int sal) {
        return sal * 12;
    }
}