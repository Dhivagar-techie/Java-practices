// constructor overloading

public class pract9 {
    public static void main(String[]args){

        construct c1=new construct();
        construct c2=new construct("adada",23);

        c1.display();
    
        c2.display();

    }
}

class construct{

     String name;
     double number;

    construct(){
      name="hiii";
         number=234234;
    }

    construct(String n,double num){
        name=n;
        number=num;
    }

    void display(){
        System.out.println(name);
        System.out.println(number);
    }
}