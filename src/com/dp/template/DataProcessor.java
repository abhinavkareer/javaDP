package com.dp.template;

public abstract class DataProcessor {


    public void readDataAndProcess(){
        readData();
        processData();
        saveData();
    }

    public void saveData() {
        System.out.println("Save data");
    }
    public abstract  void readData();
    public abstract  void processData();
}
