package secao13_heranca_polimorfismo.heranca.entities;

import javax.swing.plaf.nimbus.NimbusStyle;

//herdadndo da account
public class BusinessAccount extends Account {
    //acrescentando os atributos a mais

    private Double loanLimit;
    public BusinessAccount(){

    }

    public BusinessAccount(Integer number, String holder, Double balance, Double loanLimit) {
        super(number, holder, balance); //não precisa repetir as atribuições
        //super() o construtor da super classe: A account
        //executar a lógica do construtor da classe base
        this.loanLimit = loanLimit;
    }

    public Double getLoanLimit() {
        return loanLimit;
    }

    public void setLoanLimit(Double loanLimit) {
        this.loanLimit = loanLimit;
    }

    public void loan(double amount){
        if(amount <= loanLimit){
            deposit(amount);
        }

    }
}
