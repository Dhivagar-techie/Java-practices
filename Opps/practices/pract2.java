public class pract2 {
    public static void main(String[] args) {

        Cars c1 = new Cars();
        Cars c2 = new Cars();
        Cars c3 = new Cars();

        c1.brand = "BMW";
        c1.model = "M5";
        c1.price = 8000000;

        c2.brand = "Audi";
        c2.model = "A6";
        c2.price = 6500000;

        c3.brand = "Toyota";
        c3.model = "Fortuner";
        c3.price = 4500000;

        c1.display();
        c2.display();
        c3.display();

    }

}

class Cars {
    String brand;
    String model;
    int price;

    void display() {
        System.out.println(brand + " brand");
        System.out.println(model + " model");
        System.out.println(price + " price");
    }

}
