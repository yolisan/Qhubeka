package com.fishfingers.qhubeka;

/********
 Date: 12/09/2020
 Author: Yolisa Nogantshi
 Package: Fish-fingers Qhubeka App
 Description: Main class
 ********/

public class main{

    public static void main(String[] args){

    System.out.println("Testing");

    Employee testEmployee = new Employee();
    Level testLevel = new Level(true, 1,2);
    Progress testProgress = new Progress(testLevel,78);
    testEmployee.setProgress(testProgress);
    testEmployee.move(true);


    }
}