package basics;


class BankAccount {
    int balance; // Instance variable (har object ka apna dabba)

    // Instance method (bina static ke)
    void checkBalance() {
        System.out.println("Balance hai: " + balance);
    }

    // Static method
}

public class JavaPracticeBankExample {

    static void bankRules() {
        System.out.println("Minimum balance 1000 hona chahiye.");
        // System.out.println(balance);  <-- YAHAN ERROR AAYEGA!
    }
    public static void main (String[] args)
    {
        BankAccount rahul = new BankAccount();
        BankAccount rajat = new BankAccount();


        rahul.balance = 200;
        rajat.balance = 2200;

        rahul.checkBalance();
        rajat.checkBalance();

        bankRules();
    }


}

