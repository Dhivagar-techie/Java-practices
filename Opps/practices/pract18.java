public class pract18 {
    
    public static void main(String[] args) {
        Addition a1=new Addition("asbdba", 023, "ll3");
         a1.Add_display();
        
    }
}
class basic{
    String name;
    int Age;

    basic(String n,int a){
        this.name=n;
        this.Age=a;
    }

     void display() {
        System.out.println("name " + name);
        System.out.println("Age " + Age);
     }
}

class Addition extends basic{
    String Dept;

    Addition(String n,int a,String Dept){
        super(n,a);
        this.Dept=Dept;

    }
    void Add_display() {
          display() ;
          System.out.println(Dept+" department");

     }
}
