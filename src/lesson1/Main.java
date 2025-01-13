package lesson1;

public class Main {
    public static void main(String[] args){
        BankAccount myAccount = new BankAccount(45, "Mister Smith");
        System.out.println("Balance: "+ myAccount.getBalance());
        System.out.println("Owner: "+ myAccount.getOwner());
        System.out.println("Number: "+ myAccount.getNumber());
        System.out.println(myAccount.getInterest() +" interest.");
        myAccount.addBank("Ford");
        System.out.println("Bank: "+ myAccount.getBank());

        myAccount.changeOwner("Nathan");
        myAccount.changeInterest(10);
        myAccount.addInterest();
        System.out.println(myAccount.getBalance());
        System.out.println(myAccount.getOwner());


    }
}
