public class pract4 {
    public static void main(String[] args) {

        Circle c1 = new Circle();

        c1.radius=23;

      double a= c1.circumfernce();
       double b= c1.Area();

       System.out.println(a);
       System.out.println(b);

    }

}

class Circle {
    double radius;

    double Area() {
        return Math.PI * radius * radius;

    }

    double circumfernce() {
        return 2 * Math.PI * radius;
    }
}
