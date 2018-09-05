package com.capgemini.util;

public class Util {

    // el autoboxing combbierte lo que necesito

    // ppara creear un Integer se recomienda Integer b = Integer.valueOf(2);

    //metodo que valide si lo que le estoy dando es un numerico o un string


    public static boolean validacion( String val){  //static por que no necesito crear un objeto
        boolean status = Boolean.TRUE;

        try{
            Integer.valueOf(val);
        }
        catch (Exception e ){
            status = Boolean.FALSE;
            e.getMessage();
        }
        return status;
    }
}
