class BankAccount {

    private long accountNumber;
    private double balance;

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setBalance(double amount) {

        if (amount > 0) {
            balance = amount;
        } else {
            System.out.println("Amount must be greater than 0");
        }
    }

    public double getBalance() {
        return balance;
    }
}

public class BankAccount3 {
    public static void main(String[] args) {

        BankAccount b = new BankAccount();

        b.setAccountNumber(123456789);
        b.setBalance(5000);

        System.out.println("Account Number: " + b.getAccountNumber());
        System.out.println("Balance: " + b.getBalance());

        b.setBalance(-1000);
    }
}