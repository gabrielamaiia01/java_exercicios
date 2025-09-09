package secao13_heranca_polimorfismo.heranca.entities;

public class  Account {
    private Integer number;
    private String holder;
    public Double balance;

    public Account(){}

    public Account(Integer number, String holder, Double balance) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
    }

    public Double getBalance() {
        return balance;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public void withdraw(double amount){
        balance -= amount + 5.00 ;
    }

    public void deposit(double amount){
        balance = balance + amount;
    }

}


