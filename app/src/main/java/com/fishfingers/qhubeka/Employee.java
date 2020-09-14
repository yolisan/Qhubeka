package com.fishfingers.qhubeka;

/********
 Date: 12/09/2020
 Author: Yolisa Nogantshi
 Package: Fish-fingers Qhubeka App
 Description: Employee class representing the user and their associated attributes
 ********/

public class Employee{

    int ID;
    String firstName;
    String surname;
    Field field;
    Progress progress;
    int level;
    String levelName;

    public Employee() {
        ID = 0; //use unique id provided by Firebase?
        firstName = null;
        field = null;
        progress = new Progress(ID);
        level = 0;
        //setLevelName(level);

    }

    public Employee(int anID, String aFirstName, String aSurname, Field aField, int aLevel) {
        ID = anID;
        firstName = aFirstName;
        surname = aSurname;
        field = aField;
        level = aLevel;
        setLevelName(level);
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

    public String getLevelName() {
        return levelName;
    }

    /*
    public int getLevel(int anID) {
    	return level;
    }*/

    public void setLevelName(int aLevel) {
        level = aLevel;

        switch(level) {
            case 0:
                levelName = "Medicals";
                break;
            case 1:
                levelName = "Induction";
            case 2:
                levelName = "Field Instrumentation";
                break;
            case 3:
                levelName = "PLC";
            case 4:
                levelName = "SCADA";
                break;
            default :
                levelName = "Medicals";
        }
    }

    public String toString() {

        String employeeDetails = "Name: " + firstName + " " + surname + ", " + "Field: " + field.getFieldName() + ", " + "Level: " + level;

        return employeeDetails;
    }

    public boolean canLevelUp(){
        return progress.isLevelComplete;
    }

    public String levelUp(boolean canLevelUp){
        String didMoveString = "Employee moves up a level";
        String didNotMoveString = "Employee did not level up";

        if(canLevelUp)
        {
            level++;
            setLevelName(level);
            return didMoveString;
        }
        else
        {
            return didNotMoveString;
        }
    }

}