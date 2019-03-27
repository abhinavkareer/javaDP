package com.dp.template;

public class Test {

    public static void main(String[] args){
        ExcelFile file1=new ExcelFile();
        file1.readDataAndProcess();

        TextFile file2 = new TextFile();
        file2.readDataAndProcess();;
    }
}
