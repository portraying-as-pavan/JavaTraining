package com.moneytap.pojo;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Basics {
    private int number;
    private String name;

    public void display(){
        number=100;
        name="Pavan";
        System.out.println(number+" "+name);
    }
    public void reflection(){
        Basics basic=new Basics();
        Class example=basic.getClass();

        Method method_array[]=example.getDeclaredMethods();
        Field field_array[]=example.getDeclaredFields();

        System.out.println(" Printing methods : ");
        for(Method method:method_array){
            System.out.print(" "+method);
        }
        System.out.println();
        System.out.println(" printing Fileds : ");
        for(Field field:field_array){
            System.out.print(" "+field);
        }


    }
    public static void main(String[] args) {
        System.out.println("Hello World");
        Basics basic=new Basics();
       // Class basic1=basic.getClass();

        basic.display();
        basic.reflection();

    }

}
