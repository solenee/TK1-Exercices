package server;

import java.util.List;

import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.ws.Endpoint;

@WebService(name="IServer")
@SOAPBinding(style=SOAPBinding.Style.RPC)
public class Server_ImplSOAP extends Server_ImplBase {

	public static String SERVICE_URL = "http://localhost:8090/services";
	
	public Server_ImplSOAP() {
		super();
	}
	
	public List<Product> getCurrentOffer() {
		return getOffer();
	}
	
	public static void main(String[] args) {
		Endpoint.publish(SERVICE_URL , new Server_ImplSOAP() );
	}

}
