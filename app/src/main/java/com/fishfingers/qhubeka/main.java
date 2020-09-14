package com.fishfingers.qhubeka;

/********
 Date: 12/09/2020
 Author: Yolisa Nogantshi
 Package: Fish-fingers Qhubeka App
 Description: Main class
 ********/

public class main{

    public static void main(String[] args){

        //System.out.println("Testing");

        Field instru = new Field("Instrumentation Engineering", 5);

        Employee testEmployee = new Employee(1, "Yolisa", "Nogantshi", instru, 0);
        //Level testLevel = new Level(testEmployee.getLevel());
        Progress testProgress = new Progress(1);
        testProgress.setPercentageComplete(testEmployee.getLevel()*100/testEmployee.field.getNoOfLevels());
        testEmployee.setProgress(testProgress);

        System.out.println(testEmployee.toString());
        System.out.println();
        System.out.println("Level is now: " + testEmployee.getLevel() + " - " + testEmployee.getLevelName());
        testProgress.setPercentageComplete(testEmployee.getLevel()*100/testEmployee.field.getNoOfLevels());
        System.out.println("Progress is now " + testProgress.toString()+"%");
        System.out.println();
        System.out.println(testEmployee.levelUp(true));
        testProgress.setPercentageComplete(testEmployee.getLevel()*100/testEmployee.field.getNoOfLevels());
        System.out.println();
        System.out.println("Level is now: " + testEmployee.getLevel() + " - " + testEmployee.getLevelName());
        System.out.println("Progress is now " + testProgress.toString()+"%");

        System.out.println(testEmployee.levelUp(true));
        testProgress.setPercentageComplete(testEmployee.getLevel()*100/testEmployee.field.getNoOfLevels());
        System.out.println();
        System.out.println("Level is now: " + testEmployee.getLevel() + " - " + testEmployee.getLevelName());
        System.out.println("Progress is now " + testProgress.toString()+"%");

        System.out.println(testEmployee.levelUp(true));
        testProgress.setPercentageComplete(testEmployee.getLevel()*100/testEmployee.field.getNoOfLevels());
        System.out.println();
        System.out.println("Level is now: " + testEmployee.getLevel() + " - " + testEmployee.getLevelName());
        System.out.println("Progress is now " + testProgress.toString()+"%");

        System.out.println(testEmployee.toString());
    }
}