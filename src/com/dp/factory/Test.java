package com.dp.factory;

import java.util.Scanner;

public class Test {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter 1st num : ");
        double num1 = in.nextDouble();
        System.out.println("Enter 2nd num : ");
        double num2 = in.nextDouble();
        System.out.println("Enter Calculation type add,sub,div,mul");
        CalculateFactory factory = new CalculateFactory();
        iCalculate obj = factory.getCalculation(in.next());
        System.out.println("Result : " + obj.calculate(num1, num2));
    }


}
