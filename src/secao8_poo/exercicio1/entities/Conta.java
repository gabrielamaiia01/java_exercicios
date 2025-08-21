package secao8_poo.exercicio1.entities;

public class Conta {
    private int numeroConta;
    private String cliente;
    private Double valorDeposito;
    private Double valorSaque;
    private Double saldoConta;

    public Conta(int numeroConta, String cliente) {
        this.numeroConta = numeroConta;
        this.cliente = cliente;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }


    public double Deposito(double deposito, double saldoConta) {
        this.valorDeposito = deposito;
        this.saldoConta = saldoConta;

        return deposito += saldoConta;
    }
}
