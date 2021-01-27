class Account {
    private String name;
    private double balance;
    public Account(String name) {
        this(name, 0.0);
    }
    public Account(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public double getBalance() {
        return this.balance;
    }

    public String getInfo() {
        return "账户名称：" + this.name + " 金额：" + this.balance;
    }
}
public class task6 {
    public static void main(String args[]) {
        Account acc = new Account("高先生", 9000000);
        System.out.println(acc.getInfo());
        System.out.println(acc.getBalance());
    }
}
