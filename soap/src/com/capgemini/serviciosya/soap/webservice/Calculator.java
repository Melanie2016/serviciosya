package com.capgemini.serviciosya.soap.webservice;


import java.rmi.Remote;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;


@WebService
@SOAPBinding
public interface Calculator extends Remote {


    @WebMethod
    int add(int x, int y);


    @WebMethod
    int subtract(int x, int y);

    @WebMethod
    int multiplicate(int x, int y);
}
