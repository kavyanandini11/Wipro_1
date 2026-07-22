public class BankDemo {

    public static void main(String[] args) {
        BankAccount account = new BankAccount("Naveen", 5000.0);

        double[] withdrawals = { 2000.0, 4000.0 };

        for (double amount : withdrawals) {
            try {
                account.withdraw(amount);
            } catch (InsufficientBalanceException e) {
                System.out.println("Withdrawal declined: " + e.getMessage());
            }
            System.out.println();
        }

        System.out.println("Final balance: Rs." + account.getBalance());
    }
}
