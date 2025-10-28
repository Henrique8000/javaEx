package application;

import java.util.Date;
import java.util.Scanner;

import entities.Order;
import entities.enums.OrderStatus;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Order order = new Order(1018, new Date(), OrderStatus.PENDING_PAYMENT);
		
		System.out.println(order);
		
		OrderStatus os1 = OrderStatus.DELIVERED;
		
		OrderStatus os2 = OrderStatus.valueOf("DELIVERED");
		
		System.out.print("Insira o status: ");
		String clienteInformandoStatus = sc.nextLine();
		
		OrderStatus os3 = OrderStatus.valueOf(clienteInformandoStatus);
		
		System.out.println("os1 = " + os1);
		System.out.println("os2 = " + os2);
		System.out.println("os3 = " + os3);
		
		sc.close();
	}

}
