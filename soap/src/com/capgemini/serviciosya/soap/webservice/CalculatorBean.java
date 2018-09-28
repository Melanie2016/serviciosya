package com.capgemini.serviciosya.soap.webservice;


import javax.ejb.Stateless;
import javax.jws.WebService;


@Stateless
@WebService(
        endpointInterface = "com.capgemini.serviciosya.soap.webservice.Calculator",
        targetNamespace = "com.capgemini.serviciosya.soap.webservice",
        serviceName = "CalculatorService"
)
public class CalculatorBean implements Calculator {

    public int add(int x, int y) {
        return x + y;
    }

    public int subtract(int x, int y) {
        return x - y;
    }

    public int multiplicate (int x, int y ){
        return x*y;
    }
}