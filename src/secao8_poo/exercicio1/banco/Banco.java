package secao8_poo.exercicio1.banco;
import secao8_poo.exercicio1.entities.Conta;

import java.util.Scanner;

public class Banco {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Enter account number: ");
        int numeroConta = sc.nextInt();

        System.out.print("Enter account holder: ");
        String cliente = sc.next();

        Conta conta = new Conta(numeroConta, cliente);

        System.out.print("Is there na initial deposit (y/n)? ");
        char resp = sc.next().charAt(0);
        if (resp == 'n') {
            System.out.print("Operação encerada. ");
        } else {
            System.out.print("Enter initial deposit value: ");
        }

        double deposit = sc.nextDouble();


        System.out.println("Account data: ");
        System.out.println("Account: " + conta.getNumeroConta() + ", " + "Holder: " + conta.getCliente() + ", " +  conta.Deposito(deposit, 0));
    }

}