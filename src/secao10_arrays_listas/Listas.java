package secao10_arrays_listas;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Listas  {
    public static void main(String[] args) {

        List <String> list = new ArrayList<>();

        list.add("Maria");
        list.add("João");
        list.add("Marcos");
        list.add("Gabriela");
        list.add(2, "Ana"); //o 0 entrou na posição 2 da lista.


        System.out.println(list.size()); //ver tamanho da lista
        //list.remove(0);//remover algo de acordo com a posiçao


        for (String x : list) {
            System.out.println(x);
        }

        System.out.println("--------------------");
        //Remover um elemento por predicado
        list.removeIf( x -> x.charAt(0) == 'M');
        for (String x : list) {
            System.out.println(x);
        }

        System.out.println("--------------------");
        //procurar poosição de um elemento
        System.out.println("Index of Gabriela: " + list.indexOf("Gabriela"));

        System.out.println("--------------------");
        List<String> result = list.stream().filter(x -> x.charAt(0) == 'G').collect(Collectors.toList());

        //stream - permite expressoes lambda dentro da funçao
        //filter - vai filtrar por
        //collectors volta esse comando para lista
        for (String x : result) {
            System.out.println(x);
        }

        System.out.println("--------------------");
        String name = list.stream().filter(x -> x.charAt(0) == 'l').findFirst().orElse(null);
        System.out.println(name);
    }
    }

