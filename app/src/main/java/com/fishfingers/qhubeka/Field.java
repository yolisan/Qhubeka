package com.fishfingers.qhubeka;

/********
 Date: 12/09/2020
 Author: Yolisa Nogantshi
 Package: Fish-fingers Qhubeka App
 Description: Field class representing the field in which an employee is working
 ********/

public class Field{

    String fieldName;
    int noOfLevels;

    public Field(){
        fieldName = null;
        noOfLevels = 0;
    }

    public Field(String aFieldName, int aNoOfLevels){
        fieldName = aFieldName;
        noOfLevels = aNoOfLevels;
    }

    public void setFieldName(String aFieldName){
        fieldName = aFieldName;
    }

    public String getFieldName() {
        return fieldName;
    }

    public int getNoOfLevels() {
        return noOfLevels;
    }

    public void setNoOfLevels(int aNoOfLevels) {
        noOfLevels = aNoOfLevels;
    }
}