package entities;

public class Product {

	public String name;
	public float price;
	public float quantity;

	public double totalValueInStock() {
		return price * quantity;

	}

	public void addProducts(float quantity) {
		this.quantity += quantity;
	}

	public void removeProducts(float quantity) {
		this.quantity = quantity;
	}

	public String toString() {
		return name
				+ ", $ " 
				+ String.format("%.2f", price) 
				+ ", " 
				+ quantity 
				+ " units, Total: $ " 
				+ String.format("%.2f", totalValueInStock());
	}

}
