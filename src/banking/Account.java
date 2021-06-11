package banking;

/**
 * @author fans
 */
public class Account {

    /**
     * 余额
     */
    private double balance;

    /**
     * Account类构造器
     *
     * @param initBalance
     */
    public Account(double initBalance) {
        this.balance = initBalance;
    }

    /**
     * 获取账户余额方法
     *
     * @return balance
     */
    public double getBalance() {
        return balance;
    }

    /**
     * 存钱方法
     *
     * @param amt: 存款的钱数
     */
    public void deposit(double amt) {
        this.balance += amt;
    }

    /**
     * 取钱方法
     *
     * @param amt: 取款的钱数
     */
    public void withdraw(double amt) {
        this.balance -= amt;
    }
}
