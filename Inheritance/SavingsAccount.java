public class SavingsAccount extends Account {
    private double interestRate;

    // Constructor
    public SavingsAccount(String accountNo, String name, String address, String phoneNo, String dob, double balance, double interestRate) {
        super(accountNo, name, address, phoneNo, dob, balance);
        this.interestRate = interestRate;
    }

    // Getter and setter methods for interestRate
    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    // Method to calculate interest
    public double calculateInterest() {
        return getBalance() * interestRate / 100;
    }

    // Method to withdraw money from account
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid amount. Please enter a positive value.");
        } else if (amount > getBalance()) {
            System.out.println("Insufficient balance. Cannot withdraw.");
        } else {
            setBalance(getBalance() - amount);
            System.out.println("Withdrawal successful. Current balance: " + getBalance());
        }
    }

    // Method to deposit money into account
    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid amount. Please enter a positive value.");
        } else {
            setBalance(getBalance() + amount);
            System.out.println("Deposit successful. Current balance: " + getBalance());
        }
    }

    // Method for fixed deposit
    public void fixedDeposit(double amount, int years, double interestRate) {
        if (amount <= 0 || years <= 0 || interestRate <= 0) {
            System.out.println("Invalid input values. Please enter positive values for amount, years, and interest rate.");
        } else {
            double maturityAmount = amount * Math.pow((1 + interestRate / 100), years);
            setBalance(getBalance() + maturityAmount);
            System.out.println("Fixed deposit successful. Maturity amount: " + maturityAmount + ", Current balance: " + getBalance());
        }
    }
}
