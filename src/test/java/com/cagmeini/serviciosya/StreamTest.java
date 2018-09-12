package com.cagmeini.serviciosya;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class StreamTest {

    public static void main(String[] arg){
        List<Simpson> list = new ArrayList<>();

        list.add(new Simpson("Marge","Simpson",30));
        list.add(new Simpson("Homer","Simpson",34));
        list.add(new Simpson("Bart ","Simpson",10));
        list.add(new Simpson("Lisa" ,"Simpson",8));
        list.add(new Simpson("Maggie","Simpson",2));



        List<Simpson> a = new ArrayList<>();
        List<Simpson> b = new ArrayList<>();

        for (Simpson item : list){
            if(item.getAge() >= 18){
                a.add(item);
            }
            else{
                b.add(item);
            }
        }

        for (Simpson item : a ){
            System.out.println("Los mayores son "+ item.getName());
        }

        for (Simpson item : b ){
            System.out.println("Los menores son "+ item.getName());
        }
    }






}
// menores de 18 en una lista
// y mayores en otra


class Simpson{

    private String name;
    private String lastName;
    private int age;

    public Simpson(){

    }

    public Simpson(String name,String lastName, int age){
        this.name = name;
        this.lastName = lastName;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


}