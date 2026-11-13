public class pract5 {
    public static void main(String[] args) {

        Bank b1 = new Bank();

        b1.name = "dhiva";
        b1.Balance = 0;

        b1.deposite(2000);

        b1.display();

    }

}

class Bank {

    String name;
    int Balance;

    void deposite(int amount) {
        if (amount > 0) {
            Balance = Balance + amount;
        } else {
            System.out.println("invalid");
        }

    }

    void display() {
        System.out.println(Balance + " Balance");
        System.out.println(name + " name");
    }

}
