package application;

import entities.Product;
import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		Product product = new Product();
		
		System.out.println("Informe os dados do produto: ");
		
		System.out.println("Nome: ");
		product.name =  sc.nextLine();
		
		System.out.println("Preço: ");
		product.price = sc.nextFloat();
		
		System.out.println("Quantidade: ");
		product.quantity = sc.nextFloat();
		
		System.out.println("\nProduct data: " + product);
		
		System.out.println("\nEnter the number of products to be added in stock: ");
		float quantity = sc.nextFloat();
		
		product.addProducts(quantity);
		System.out.println("\nUpadated data: " + product);
		
		System.out.println("\nEnter the number of products to be removed in stock: ");
		quantity = sc.nextFloat();
		
		product.removeProducts(quantity);
		System.out.println("\nRemoved data: " + product);
		
		
		sc.close();
		
	}

}
