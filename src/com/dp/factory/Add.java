package com.dp.factory;

public class Add implements iCalculate{

    public double calculate(double num1,double num2){
        double ret=0;

        try{
            ret=num1+num2;
        }catch (Exception e){
            ret=0;
            e.printStackTrace();
        }
        return ret;
    }

}
