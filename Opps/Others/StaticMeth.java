public class StaticMeth {

    public static void main(String[] args) {

        details obj1 = new details();

        obj1.brand = "BMW";
        obj1.name = "LandCruser";
        obj1.price = 120000;

        details obj2 = new details();

        obj2.brand = "Scorpio";
        obj2.name = "BUmblebbe";
        obj2.price = 230040;

        obj1.CarDetails();
        obj2.CarDetails();

    }

}

public class details {
    String brand;
    int price;
    String name;

    public void CarDetails() {
        System.out.println(brand + " : " + price + " : " + " : " + name);
    }

}