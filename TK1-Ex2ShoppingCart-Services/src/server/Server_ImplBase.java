package server;


import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

public abstract class  Server_ImplBase implements IServer {
	Hashtable<Integer, ?> carts;
	List<Product> offer;
	
	public List<Product> getOffer() {
		return offer;
	}

	public Server_ImplBase() {
		initializeOffer();
	}
	
	private void initializeOffer() {
		offer = new ArrayList<Product>();
		Product p = new Product("T-shirt", 15, 4);
		offer.add(p);
		p = new Product("Jeans Simon", 80, 2);
		offer.add(p);
		p = new Product("Polo n7", 10, 7);
		offer.add(p);
	}
	
	public boolean buyProduct(Product p){
		// TODO gerer la synchronisation et le cas ou il y en a plus
		this.offer.remove(p);
		return true;
	}

}
