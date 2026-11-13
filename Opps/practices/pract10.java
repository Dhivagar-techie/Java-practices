public class pract10 {
    public static void main(String[] args) {

        Statement s1=new Statement("balu", 100);
        s1.display();
        s1.deposite(20000);
        s1.display();;
        
    }
    
}

class Statement{

     String name;
     int balance=0;
     int amount;

    Statement(String name,int balance){
        this.name=name;
        this.balance=balance;

    }

    void deposite(int amount){

    if (amount>0){
        balance=balance+amount;
    }
    else{
        System.out.println("invalid");
    }
    
    }

    void display(){
        System.out.println(name+" name");
        System.out.println(balance+ "balance");
    }

}
