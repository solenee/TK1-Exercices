package client;

import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

public class Client_ImplSOAP {

	public static void main(String args[]) {
		try {
			Service service = Service.create(new URL("http://localhost:8090/services?wsdl"), new QName("http://tk.informatik.tu-darmstadt.de",
					"Service_ImplSOAP")); 
			//Service_ImplSOAP serviceSOAP = service.getPort(Service_ImplSOAP.class);
			//System.out.println(shapeList.getVersion()); 
			}
		catch(Exception x) { x.printStackTrace();
		}

		}
}
