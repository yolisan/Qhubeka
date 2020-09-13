package com.fishfingers.qhubeka;

/********
 Date: 12/09/2020
 Author: Yolisa Nogantshi
 Package: Fish-fingers Qhubeka App
 Description: Field class representing the field in which an employee is working
 ********/

public class Field{

    String fieldName;

    public void Field(){
        fieldName = null;
    }

    public void Field(String aFieldName){
        fieldName = aFieldName;
    }

    public void setFieldName(String aFieldName){
        fieldName = aFieldName;
    }

    public String getFieldName() {
        return fieldName;
    }
}