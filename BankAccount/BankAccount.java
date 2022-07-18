public class BankAccount {


    private double checkingBalance;
    private double savingBalance;
    public static int numberOfAccounts = 0;
    public static double amountOfMoney = 0;

    public BankAccount() {
        BankAccount.numberOfAccounts += 1;
        this.checkingBalance = 0;
        this.savingBalance = 0;
    }

    public void deposit(double amount, String account) {
        if (account == "checking"){
            this.checkingBalance += amount;
        }
        else {
            this.savingBalance += amount;
        }

        BankAccount.amountOfMoney += amount;
    }

    public void withdraw(double amount, String account){
        if (account == "checking"){
            if(amount > this.checkingBalance){
                System.out.println("No Funds available!");
                return;
            }
            this.checkingBalance -= amount;
        }
        else {
            if(amount > this.savingBalance){
                System.out.println("No Funds available!");
                return;
        }
        this.savingBalance -= amount;
    }
        BankAccount.amountOfMoney -= amount;
    }
    

    public double getCheckingBalance() {
        return this.checkingBalance;
    }

    public double getSavingBalance() {
        return this.savingBalance;
    }
}
