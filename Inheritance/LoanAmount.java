public class LoanAccount extends Account {
    private double loanAmount;
    private double emi;
    private int tenure;
    private double interestRate;

    // Constructor
    public LoanAccount(String accountNo, String name, String address, String phoneNo, String dob, double loanAmount, double emi, int tenure, double interestRate) {
        super(accountNo, name, address, phoneNo, dob, 0.0);
        this.loanAmount = loanAmount;
        this.emi = emi;
        this.tenure = tenure;
        this.interestRate = interestRate;
    }

    // Getter and setter methods for loanAmount, emi, tenure, and interestRate
    public double getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(double loanAmount) {
        this.loanAmount = loanAmount;
    }

    public double getEmi() {
        return emi;
    }

    public void setEmi(double emi) {
        this.emi = emi;
    }

    public int getTenure() {
        return tenure;
    }

    public void setTenure(int tenure) {
        this.tenure = tenure;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    // Method to calculate EMI
    public void calculateEMI() {
        double r = interestRate / 1200;  // monthly interest rate
        double n = tenure * 12;          // number of months
        emi = loanAmount * r * Math.pow(1 + r, n) / (Math.pow(1 + r, n) - 1);
    }

    // Method to pay EMI
    public void payEMI() {
        if (getBalance() >= emi) {
            setBalance(getBalance() - emi);
            System.out.println("EMI payment successful. Current balance: " + getBalance());
        } else {
            System.out.println("Insufficient balance. EMI payment unsuccessful.");
        }
    }

    // Method for top-up loan
    public void topUpLoan(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid amount. Please enter a positive value.");
        } else {
            loanAmount += amount;
            calculateEMI();
            System.out.println("Top-up loan successful. Current EMI: " + emi);
        }
    }

    // Method for loan repayment
    public void repayment(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid amount. Please enter a positive value.");
        } else {
            double outstandingAmount = loanAmount - (emi * (tenure * 12));
            if (amount > outstandingAmount) {
                double excessAmount = amount - outstandingAmount;
                setBalance(getBalance() + excessAmount);
                System.out.println("Loan fully repaid. Excess amount added to account balance. Current balance: " + getBalance());
            } else {
                setBalance(getBalance() - amount);
                System.out.println("Partial loan repayment successful. Outstanding amount: " + (outstandingAmount - amount) + ", Current balance: " + getBalance());
            }
        }
    }
}
