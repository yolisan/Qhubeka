package com.fishfingers.qhubeka;

/********
 Date: 12/09/2020
 Author: Yolisa Nogantshi
 Package: Fish-fingers Qhubeka App
 Description: Employee class representing the user and their associated attributes
 ********/

public class Employee{

    int ID;
    String firstName, surname;
    Field field;
    Progress progress;
    int level;

    public Employee() {
        ID = 0; //use unique id provided by Firebase?
        firstName = null;
        field = new Field();
        progress = new Progress();

    }

    public Employee(String aFirstName) {

        firstName = aFirstName;
    }

    public int getID() {
        return ID;
    }

    public void setID(int anID){
        ID = anID;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSurname() {
        return surname;
    }

    public Field getField() {
        return field;
    }

    public Progress getProgress() {
        return progress;
    }

    public void setProgress(Progress aProgress) {
        progress = aProgress;
    }

    public int getLevel() {
        return level;
    }

    public boolean canMove(){
        return progress.isLevelComplete;
    }

    public String move(boolean canMove){
        String didMoveString = "Employee moved";
        String didNotMoveString = "Employee did not move";

        if(canMove)
        {
            return didMoveString;
        }
        else
        {
            return didNotMoveString;
        }
    }
}