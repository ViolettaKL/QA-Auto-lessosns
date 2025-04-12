package HW_2;

public class BankAccount {
    String owner;
    static double balance;

    BankAccount(String someOwner, double someBalance){
        this.owner = someOwner;
        this.balance = someBalance;
    }

    public double getBalance() {
        return balance;
    }

    public String getOwner() {
        return owner;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
    static void deposit(double amount){
       balance += amount;
    }
    static void withdraw(double amount){
        balance -= amount;
    }
    static void printBalance(){
        System.out.println("Общий баланс: " + balance);
    }
}
