package secao16_interfaces.projeto1.application;

import secao16_interfaces.projeto1.models.entities.Vehicle;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com os dados do aluguel: ");
        System.out.println("Modelo do carro: ");
        sc.nextLine();
        String modelo = sc.nextLine();
        Vehicle vehicle = new Vehicle(modelo);


    }
}
