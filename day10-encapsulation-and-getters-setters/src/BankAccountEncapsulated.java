/**
 * BankAccountEncapsulated.java
 *
 * Demonstrates real-world encapsulation:
 * 1. Private sensitive state: 'balance' and 'accountNumber'.
 * 2. Public validated operations: deposit and withdraw.
 * 3. Preventing invalid transactions (e.g., negative deposits or overdrafts).
 */
public class BankAccountEncapsulated {

    // Private fields: preventing external tampering
    private final String accountNumber;
    private double balance;

    public BankAccountEncapsulated(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        if (initialBalance >= 0) {
            this.balance = initialBalance;
        } else {
            this.balance = 0;
            System.out.println("⚠️ Warning: Initial balance cannot be negative. Set to $0.00.");
        }
    }

    /**
     * Read-only getter for account number.
     * Notice: There is NO setter for accountNumber, making it immutable after creation!
     */
    public String getAccountNumber() {
        return accountNumber;
    }

    /**
     * Getter for current balance.
     */
    public double getBalance() {
        return balance;
    }

    /**
     * Validated deposit method.
     *
     * @param amount Dollars to deposit
     */
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.printf("✅ Deposited: $%.2f | New Balance: $%.2f%n", amount, balance);
        } else {
            System.out.println("❌ Deposit Error: Deposit amount must be greater than zero.");
        }
    }

    /**
     * Validated withdraw method.
     *
     * @param amount Dollars to withdraw
     */
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("❌ Withdrawal Error: Amount must be positive.");
            return;
        }
        if (amount <= balance) {
            balance -= amount;
            System.out.printf("✅ Withdrew: $%.2f | Remaining Balance: $%.2f%n", amount, balance);
        } else {
            System.out.printf("❌ Insufficient Funds: Tried to withdraw $%.2f, but balance is only $%.2f%n",
                    amount, balance);
        }
    }

    public static void main(String[] args) {
        System.out.println("=== Bank Account Encapsulation Demo ===");

        BankAccountEncapsulated account = new BankAccountEncapsulated("AC-984210", 500.00);
        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.printf("Initial Balance: $%.2f%n%n", account.getBalance());

        // Valid operations
        account.deposit(150.75);
        account.withdraw(200.00);

        // Invalid operations blocked by encapsulation
        System.out.println("\n-- Testing Safety Constraints --");
        account.deposit(-50.00);   // Blocked!
        account.withdraw(1000.00); // Blocked by insufficient funds!

        System.out.printf("%nFinal Verified Balance: $%.2f%n", account.getBalance());
    }
}
