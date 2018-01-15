package webService;

import javax.jws.*;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;
 
//Service Implementation
@WebService
public class HelloImp{
 
	public String getHelloWorldAsString(String name) {
		System.out.println("the name is :" + name);
		return "Hello " + name;
	}
 
}