package lesson1;

/**
 * Operations: deposit money, withdraw money, get current balance
 * Instance variables (what makes a bank account):
 * Account number
 * Current balance
 * Interest
 * Associated bank
 * Owner
 */

public class BankAccount {

    private String accountNumber;
    private double balance;
    private double interestRate;
    private String bank;
    private String owner;

    public BankAccount(){
        balance = 0;
    }


    //overloading constructor
    public BankAccount(double initialBalance){
        balance = initialBalance;
    }

    // setters / mutators
    /**
     * Deposits a specified amount of money into the account
     * @param amount amount to deposit
     */
    public void deposit(double amount){
        balance += amount;
    }

    public void withdraw(double taken){
        balance -= taken;
    }

    // getter (accessor):
    public double getBalance(){
        return balance;
    }

    @Override
    public String toString(){
        return String.format("Balance: $%.2f", balance);
    }

}
