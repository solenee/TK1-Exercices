package server;

import java.util.List;

public interface IServer {

	public static int PORT_REST = 8080;
	public static int PORT_SOAP = 8090;
	// constructeur (SOAP / Rest) 
	// getPort()
	
	// start 
	
	
	// manage each shopping cart thanks to unique IDs
	// manage amounts
	
	// provide information for every product 
	//public Product getProductInformation(String nameProduct);
	
	/** Provide information about all the products */ 
	public List<Product> getCurrentOffer();
}
