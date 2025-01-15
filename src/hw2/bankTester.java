package hw2;

public class bankTester {
    public static void main(String[] args) {
        BankCopy myAccount = new BankCopy(45, "Mister Smith");
        System.out.println("Balance: " + myAccount.getBalance());
        System.out.println("Owner: " + myAccount.getOwner());
        System.out.println("Number: " + myAccount.getNumber());
        System.out.println(myAccount.getInterest() + " interest.");
        myAccount.addBank("Ford");
        System.out.println("Bank: " + myAccount.getBank());

        myAccount.changeOwner("Nathan");
        myAccount.changeInterest(10);
        myAccount.changeDrawFee(9.99);
        myAccount.addInterest();
        System.out.println(myAccount.getBalance());
        System.out.println(myAccount.getOwner());
        myAccount.deposit(39.99);
        System.out.println(myAccount.getBalance());
    }
}
