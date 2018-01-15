package webService;

import javax.xml.ws.Endpoint;



//Endpoint publisher
public class HelloImpPublisher{
	
	public static void main(String[] args) {
	   Endpoint.publish("http://localhost:9999/ws/hello", new HelloImp());
	   System.out.println("Service Started");
    }

}