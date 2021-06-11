package banking.test;

import banking.Account;

/**
 * 测试Account类
 *
 * @author fans
 */
public class AccountTest {

    public static void main(String[] args) {
        //1.Creating an account with a 500.00 balance
        Account account = new Account(500.00);
        System.out.println("新创建的账户余额为：" + account.getBalance());

        //2.Withdraw 150.00
        account.withdraw(150.00);
        System.out.println("取款150.00后的账户余额：" + account.getBalance());

        //3.Deposit 22.50
        account.deposit(22.50);
        System.out.println("存款22.50后的账户余额：" + account.getBalance());

        //4.Withdraw 47.62
        account.withdraw(47.62);
        System.out.println("取款47.62后的账户余额：" + account.getBalance());
    }
}
