public class BankService {

    // Nested class
    static class BankAccount {
        private double balance;

        public BankAccount(double initialBalance) {
            if (initialBalance < 0) {
                throw new IllegalArgumentException("Initial balance cannot be negative");
            }
            this.balance = initialBalance;
        }

        public void deposit(double amount) {
            if (amount <= 0) {
                throw new IllegalArgumentException("Deposit must be positive");
            }
            balance += amount;
        }

        public void withdraw(double amount) {
            if (amount <= 0 || amount > balance) {
                throw new IllegalArgumentException("Invalid withdrawal");
            }
            balance -= amount;
        }

        public double getBalance() {
            return balance;
        }
    }

    // Main method
    public static void main(String[] args) {
        BankAccount acc = new BankAccount(5000);

        System.out.println("Initial Balance: " + acc.getBalance());

        acc.deposit(700);
        System.out.println("Balance after deposit of 700: " + acc.getBalance());

        acc.withdraw(100);
        System.out.println("Balance after withdrawal of 100: " + acc.getBalance());

        System.out.println("Final Balance: " + acc.getBalance());
    }

}   // ✅ THIS was missing
