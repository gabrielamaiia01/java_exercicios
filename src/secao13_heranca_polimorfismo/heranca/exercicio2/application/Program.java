package secao13_heranca_polimorfismo.heranca.exercicio2.application;
import secao13_heranca_polimorfismo.heranca.exercicio1.entities.OutsourcedEmployee;
import secao13_heranca_polimorfismo.heranca.exercicio2.entities.Circle;
import secao13_heranca_polimorfismo.heranca.exercicio2.entities.Rectangle;
import secao13_heranca_polimorfismo.heranca.exercicio2.entities.Shape;
import secao13_heranca_polimorfismo.heranca.exercicio2.entities.enums.Color;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Shape> list = new ArrayList<>();

        System.out.println("Enter the number of shapes: ");
        int n = sc.nextInt();

        for (int i  = 1; i <= n; i++) {
            System.out.println("Enter the shape " + i + ": ");
            System.out.print("Rectangle or Circle: (r/c)");
            char ch = sc.next().charAt(0);
            System.out.print("Color: (BLACK/BLUE/RED)");

            Color color = Color.valueOf(sc.next());
            if (ch == 'r'){
                System.out.println("Width: ");
                double width = sc.nextDouble();
                System.out.println("Height: ");
                double height = sc.nextDouble();
                list.add(new Rectangle(color, width, height ));
            } else {
                System.out.println("Radius: ");
                double radius = sc.nextDouble();
                list.add(new Circle(color, radius));

            }

          System.out.println("SHAPE AREA: ");
            for (Shape shape : list) {
                System.out.println(shape.area());
            }
         sc.close();
        }
    }
}
