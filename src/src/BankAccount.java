public class BankAccount implements IBank{
    private  String accountId;
    private double balance;
    private String userName;
    private String phoneNumber;

    public BankAccount(String accountId, String userName, String phoneNumber) {
        this.accountId = accountId;
        this.userName = userName;
        this.phoneNumber = phoneNumber;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAccountId() {
        return accountId;
    }

    public double getBalance() {
        return balance;
    }

    public String getUserName() {
        return userName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public void withdraw(double amount) {
        this.balance -= amount;
        System.out.println("Đã rút tiền : " + amount);
    }

    @Override
    public void deposit(double amount) {
        this.balance += amount;
        System.out.println("Đã nhận tiền : " + amount);
    }

    public void displayBalance(){
        System.out.printf("Số dư tài khoản (%s): %.2f%n",accountId,balance);
    }
}
