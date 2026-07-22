public class BankAccount {

    private String holder;
    private double balance;

    public BankAccount(String holder, double balance) {
        this.holder = holder;
        this.balance = balance;
    }

    public void withdraw(double amount) throws InsufficientBalanceException {
        System.out.println("Attempting to withdraw Rs." + amount + " for " + holder);
        try {
            if (amount > balance) {
                throw new InsufficientBalanceException(
                        "Insufficient balance. Available: Rs." + balance + ", requested: Rs." + amount);
            }
            balance = balance - amount;
            System.out.println("Withdrawal successful. Remaining balance: Rs." + balance);
        } finally {
            System.out.println("Transaction attempt completed for " + holder + ".");
        }
    }

    public double getBalance() {
        return balance;
    }
}
