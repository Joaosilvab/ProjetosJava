package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enuns.OrderStatus;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		
		
		
		System.out.println("Enter cliente data:");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.nextLine();
		System.out.print("Birth date (DD/MM/YYYY): ");
		Date birthdate = sdf.parse(sc.next());
		System.out.println("Enter order data: ");
		sc.nextLine();
		System.out.print("Status: ");
		String status = sc.nextLine();
		
		Order order = new Order(new Date(),OrderStatus.valueOf(status) , new Client(name,email,birthdate));
		OrderItem orderitem = new OrderItem();
		
		System.out.print("How many items to this order? ");
		int n = sc.nextInt();
		 
		for(int i = 1; i <= n; i++) {
			System.out.println("Enter #" + i + "item data:");
			System.out.print("Product name: ");
			sc.nextLine();
			String productName = sc.nextLine();
			System.out.print("Product price: ");
			double price = sc.nextDouble();
			System.out.print("Quantity: ");
			int quant = sc.nextInt();
			orderitem = new OrderItem(quant,price,new Product(productName,price));
			order.addItem(orderitem);
		}
		
		System.out.println();
		
		System.out.println("ORDER SUMMARY:");
		System.out.println(order);
		System.out.println("Order items:");
		order.exibir();
		System.out.printf("Total price: $%.2f", order.total() );
		
		sc.close();

	}

}
