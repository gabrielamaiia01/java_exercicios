package secao14_tratamento_excecoes;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        try {
            Scanner sc = new Scanner(System.in);

            String[] vect = sc.nextLine().split(" ");
            int position = sc.nextInt();
            System.out.println(vect[position]);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid position");
        }
        catch (InputMismatchException e) {
            System.out.println("Input invalid");
        }
        System.out.println("End of Program");




    }
}
