public class carobj {

    public void speed(int spd) {
        System.out.println("the full speed will be" + spd);
    }

    public void thottle() {
        System.out.println("full thottle will go cray");
    }

    public static void main(String[] args) {

        carobj obj = new carobj();

        obj.speed(250);

        obj.thottle();

    }

}
