package secao10_arrays_listas.exercicio1.registro;

import secao10_arrays_listas.exercicio1.entities.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;


public class Registro {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List <Employee> list = new ArrayList<>();

        System.out.println("How many employees will be registered:");
        int N = sc.nextInt();

        for (int i = 0; i < N; i++) {

            System.out.println();
            System.out.println("Employee #" + (i + 1));
            System.out.print("ID: ");
            int id = sc.nextInt();

            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();

            System.out.print("Salary: ");
            Double salary = sc.nextDouble();

            Employee employee = new Employee(id, name, salary);

            list.add(employee); //Adiciona esse objeto na lista.
        }

        System.out.print("Salary: ");
        int idsalary = sc.nextInt();
        Integer pos = position(list, idsalary);//Procurando a posição do Idsalary dentro da lista
        if (pos == null) {
            System.out.print("This Id does not exist!");
        }
        else {
            System.out.print("Enter the percentage: ");
            double percent = sc.nextDouble();
            list.get(pos).increaseSalary(percent); //pega o id e chama a função para incrementar o salário
        }


        System.out.print("List of employess");
        for (Employee id: list) {
            System.out.print(id);
        }

        sc.close();
    }

    public static Integer position(List<Employee> list,int id ) {
        for (int i = 0; i < list.size(); i++) {
            //teste se o id da posição é igual a id da lista
            if(list.get(i).getId() == id) {
                return i;
            }
        }
        return null;
    }

}
