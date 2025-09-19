package secao14_tratamento_excecoes;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Bloco {
    public static void main(String[] args) {
        File file = new File("C:\\temp\\documento.txt");
        Scanner sc = null;

        try{
            sc = new Scanner(file);
            while (sc.hasNextLine()){
                System.out.println(sc.nextLine());
            }
        }
         catch (FileNotFoundException e) {
            System.out.println("Erro ao tentar ler o arquivo");
        } finally { //será executado independente de ter ocorrido ou não a exceção
            if (sc != null){
                sc.close();
            }
            System.out.println("Finally block executed");
        }
    }
}
