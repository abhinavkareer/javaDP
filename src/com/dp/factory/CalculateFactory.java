package com.dp.factory;

public class CalculateFactory {

    public iCalculate getCalculation(String type) {
        iCalculate cal = null;
        type=type.toLowerCase();

        switch(type){

            case "add":{
                cal=new Add();
                break;
            }

            case "sub":{
                cal=new Subtract();
                break;
            }

            case "mul":{
                cal=new Multiply();
                break;
            }

            case "div":{
                cal=new Divide();
                break;
            }


        }


        return cal;
    }


}
