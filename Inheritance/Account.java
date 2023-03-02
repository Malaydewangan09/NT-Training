public class Account {
    private String accountNo;
    private String name;
    private String address;
    private String phoneNo;
    private String dob;
    private double balance;

    // Constructor
    public Account(String accountNo, String name, String address, String phoneNo, String dob, double balance) {
        this.accountNo = accountNo;
        this.name = name;
        this.address = address;
        this.phoneNo = phoneNo;
        this.dob = dob;
        this.balance = balance;
    }

    // Getter methods
    public String getAccountNo() {
        return accountNo;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public String getDob() {
        return dob;
    }

    public double getBalance() {
        return balance;
    }

    // Setter methods
    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    // toString method
    public String toString() {
        return "Account No: " + accountNo +
                "\nName: " + name +
                "\nAddress: " + address +
                "\nPhone No: " + phoneNo +
                "\nDOB: " + dob +
                "\nBalance: " + balance;
    }
}
