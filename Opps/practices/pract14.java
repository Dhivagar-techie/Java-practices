public class pract14 {
    public static void main(String[] args) {

        Another a1 = new Another("hiee", 89,"dasda");

      
        a1.displayAnother();

    }

}

class person {
    String name;
    int Age;

    person(String n, int a) {
        this.name = n;
        this.Age = a;

    }

    void display() {
        System.out.println("name " + name);
        System.out.println("Age " + Age);
    }

}

class Another extends person {
    String Departmaent;

    Another(String s, int a,String n) {
        super(n, a);
        this.Departmaent = s;
    }

    void displayAnother() {
        display();
        System.out.println("Department " + Departmaent);
    }

}