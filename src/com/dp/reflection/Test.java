package com.dp.reflection;

import java.lang.reflect.Field;

public class Test {


    public static void main(String args[]){

        Contact c1=new Friend();
        c1.name="Raj";
        ((Friend)c1).phoneNumber="1232131312";
       System.out.println(c1);
        Contact c2=new Work();
        c2.name="yo yo";
        ((Work)c2).email="akareer@sonicwall.com";
        System.out.println(c2);
    }
}
