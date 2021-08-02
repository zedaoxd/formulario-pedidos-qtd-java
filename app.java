package Exercicio9;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class app {
    private static List<OrderItem> orderItens;

    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        System.out.println("Enter cliente data: ");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("E-mail: ");
        String email = sc.nextLine();
        System.out.print("Birth date (DD/MM/YYYY): ");
        Date birthDate = sdf.parse(sc.nextLine());

        Client client = new Client(name, email, birthDate);

        System.out.println("Enter order data: ");
        System.out.print("Status: ");
        String status = sc.nextLine();
        Order order = new Order(new Date(), OrderStatus.valueOf(status));
        System.out.print("How many items to this order? ");
        int qtd = sc.nextInt();
        sc.nextLine();
        for(int i=1; i<=qtd; i++){
            System.out.println("Enter #" + i + " item data:");
            System.out.print("Product name: ");
            String product_name = sc.nextLine();
            System.out.print("Product price: ");
            Double product_price = sc.nextDouble();
            sc.nextLine();
            System.out.print("Quantity: ");
            Integer product_quantity = sc.nextInt();
            sc.nextLine();
            OrderItem order_item = new OrderItem(product_quantity, product_price, new Product(product_name, product_price));
            order.addItem(order_item);
            System.out.println("--------------------------------");
        }

        System.out.println("ORDER SUMMARY:");
        System.out.print("Order moment: " + sdf2.format(order.getMoment()) + "\n");
        System.out.print("Order status: " + order.getStatus() + "\n");
        System.out.print("Client: " + client.getName() + " (" + sdf.format(client.getBirthDate()) + ") - " + client.getEmail() + "\n");
        System.out.println("Order items:");
        orderItens = order.getOrderItens();
        for(OrderItem product : orderItens){
            System.out.println(product);
        }
        System.out.println("Total price: $" + order.total());


        sc.close();
    }
}
