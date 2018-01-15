package com.wagdi;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

@WebService
public class HelloImp{

 public String getHelloWorldAsString(@WebParam(name="name") String name) {
        return "Hello World JAX-WS " + name;
    }

}