package server;

public class Product {

	private String name;
	private float price;
	private int availableAmount;
	
	public Product(String _name, int _price, int _amount) {
		setName(_name);
		setPrice(_price);
		setAvailableAmount(_amount);
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public int getAvailableAmount() {
		return availableAmount;
	}
	public void setAvailableAmount(int availableAmount) {
		this.availableAmount = availableAmount;
	}
}
