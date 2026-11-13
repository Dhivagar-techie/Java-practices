public class pract12 {
    public static void main(String[] args) {
        Balance b1=new Balance();

        b1.deposite(1234);
        b1.deposite(1208);
        
 System.out.println(b1.getbal());
        
    }
    
}
class Balance{
    private int balance;

    public void deposite(int amount){
        if(amount>0){
            balance=balance+amount;
            System.out.println(amount+" amount Added Succesfully");
        }
        else{
            System.out.println("invalid");
        }

    }

    public int getbal(){
        return balance;
    }
}