package com.capgemini.serviciosya.soap.client;

import com.capgemini.serviciosya.soap.webservice.Calculator;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.net.URL;

public class Client {
    public static void main(String[] args) throws Exception {

        final QName serviceName = new QName("com.capgemini.serviciosya.soap.webservice", "CalculatorService");
        final URL wsdlURL = new URL("http://localhost:8090/serviciosya/CalculatorService/CalculatorBean?wsdl");

        final Service service = Service.create(wsdlURL, serviceName);
        final Calculator calculator = (Calculator) service
                .getPort(Calculator.class);



        System.out.println();
        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
        System.out.println("ADD:  5 + 2 = " + calculator.add(5, 2));
        System.out.println("DIFF: 1 - 1 = " + calculator.subtract(1, 1));
        System.out.println("MULT: 3 * 4 = " + calculator.multiplicate(1,3));
        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
        System.out.println();
    }
}

