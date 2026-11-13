public class pract8 {
    public static void main(String[] args) {

        construct c1 = new construct("Arun", 101, "25000");
   
        construct c2 = new construct("Ravi", 102, "30000");

  c1.display();
  
  c2.display();

   

    }

}

class construct {
    String name;
    int age;
    String Department;

    construct(String n, int a, String D) {

        name = n;
        age = a;
        Department = D;
    }


        void display(){
              System.out.println("Name: " + name);
        System.out.println("ID: " + age);
        System.out.println("Salary: " + Department);
        

    }
}
