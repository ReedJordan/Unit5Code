package lesson1;

import java.util.Random;

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

    Random rand = new Random();

    private String accountNumber;
    private double balance;
    private double interestRate;
    private String bank;
    private String owner;
    private double drawFee;

    //constructors must have the same name as the class
    public BankAccount(){
        balance = 0;
    }

    //overloading constructor
    public BankAccount(double initialBalance){
        balance = initialBalance;
    }

    public BankAccount(double startBalance, String userName){
        balance = startBalance;
        owner = userName;
        int ranNum = rand.nextInt(0,99999999);
        accountNumber = ranNum + " ";
    }

    // setters / mutators
    public void deposit(double amount){
        balance = balance + amount - drawFee;
    }

    public void withdraw(double taken){
        balance = balance - taken - drawFee;
    }

    public void changeOwner(String newOwner){
        owner = newOwner;
    }

    public void changeInterest(int newInterest){
        interestRate = newInterest;
    }

    public void changeDrawFee(double newFee){
        drawFee = newFee;
    }

    public void addInterest(){
        balance += (balance * (interestRate/100));
        balance = (int)(balance * 100);
        balance = balance / 100;
    }

    public void addBank(String newBank){
        bank = newBank;
    }

    // getter (accessor):
    public double getBalance(){
        return balance;
    }
    public String getNumber(){
        return accountNumber;
    }
    public String getInterest(){
        return interestRate +"%";
    }
    public String getBank(){
        return bank;
    }
    public String getOwner(){
        return owner;
    }

    @Override
    public String toString(){
        return String.format("Balance: $%.2f", balance);
    }

}
