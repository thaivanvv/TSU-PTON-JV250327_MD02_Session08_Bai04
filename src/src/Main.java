public class Main {
    public static void main(String[] args) {
        // Tạo tài khoản cho A và B
        BankAccount accountA = new BankAccount("A001","Nguyen Van A","02139521");
        BankAccount accountB = new BankAccount("B001","Nguyen Van B","24143221");

        // nạp tiền vào tài khoản A
        accountA.deposit(3000);

        // Chuyển tiên từ A qua B
        double transferAmount = 300;
        accountA.withdraw(transferAmount);// rút tiền từ tài khoản A
        accountB.deposit(transferAmount);// chuyển tiền vào tài khoản B

        accountA.displayBalance();
        accountB.displayBalance();
    }
}