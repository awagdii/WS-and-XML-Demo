import serviceSource.*;

public class SampleClient{
	
	public static void main(String[] args) {
	   
		HelloImpService helloService = new HelloImpService();
		
		HelloImp hello = helloService.getHelloImpPort();
	
		System.out.println(hello.getHelloWorldAsString("Wagdi"));
		
    }

}