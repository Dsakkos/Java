public class BankAccountTest {
    public static void main(String[] args){

        BankAccount account1 = new BankAccount();
        account1.deposit(1500, "checking");
        account1.deposit(10000, "savings");
        account1.withdraw(15000, "checking");
        account1.withdraw(35, "savings");

        System.out.println(account1.getCheckingBalance());
        System.out.println(account1.getSavingBalance());

        System.out.println(BankAccount.amountOfMoney);
    }
}