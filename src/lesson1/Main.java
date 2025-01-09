package lesson1;

public class Main {
    public static void main(String[] args){
        BankAccount myAccount = new BankAccount(45);
        System.out.println(myAccount.getBalance());
        myAccount.deposit(155.28);
        System.out.println(myAccount.getBalance());
        myAccount.withdraw(6.99);
        System.out.println(myAccount.getBalance());


    }
}
