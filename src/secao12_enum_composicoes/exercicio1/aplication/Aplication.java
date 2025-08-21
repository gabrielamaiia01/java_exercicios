package secao12_enum_composicoes.exercicio1.aplication;

import secao12_enum_composicoes.exercicio1.entities.Order;
import secao12_enum_composicoes.exercicio1.entities_enum.OrderStatus;

import java.util.Date;

public class Aplication {
    public static void main(String[] args) {
        Order oder = new Order(1080, new Date(), OrderStatus.SHIPPED); //Mostra o status do pedido; pelo enum.

        System.out.println(oder.toString());

        OrderStatus os1 = OrderStatus.DELIVERED;
        OrderStatus os2 = OrderStatus.valueOf("DELIVERED"); //Conversão de String para enum;
        //Converter o String para uma instância do tipo enumerado;

        System.out.println(os1);
        System.out.println(os2);
    }
}
