package secao13_heranca_polimorfismo.heranca.application;

import secao13_heranca_polimorfismo.heranca.entities.Account;
import secao13_heranca_polimorfismo.heranca.entities.BusinessAccount;
import secao13_heranca_polimorfismo.heranca.entities.SavingAccount;

public class Program {
    public static void main(String[] args) {
        Account acc1 = new Account(1001, "Alex", 1000.0);
        acc1.withdraw(200.00);
        System.out.println(acc1.getBalance());

        Account acc2 = new SavingAccount(2, "Maria", 1000.0, 0.01);
        acc2.withdraw(200.00);
        System.out.println(acc2.getBalance());

        Account acc3 = new BusinessAccount(1003, "Bob", 1000.0, 500.00);
        acc3.withdraw(200.0);
        System.out.println(acc3.getBalance());

    }
}
