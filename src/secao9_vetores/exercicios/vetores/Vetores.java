package secao9_vetores.exercicios.vetores;
import secao9_vetores.exercicios.entities.Produto;
import java.util.Scanner;

public class Vetores {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Produto [] vetor = new Produto[n];

        for (int i = 0; i < n; i++) {
            String name = sc.next();
            double price = sc.nextDouble();

            vetor[i] = new Produto(name,price);
        }

        double soma = 0.00;
        for (int i = 0; i < n; i++) {
            soma += vetor[i].getPrice();
        }

        double media = soma / n;
        System.out.print(media);


    }
}
