package com.fishfingers.qhubeka;

/********
 Date: 12/09/2020
 Author: Yolisa Nogantshi
 Package: Fish-fingers Qhubeka App
 Description: Progress class with attributes regarding employee's progress
 ********/

public class Progress{

    int employeeID;
    Level level;
    int percentageComplete;
    boolean isLevelComplete;

    public Progress(int anEmployeeID){
        employeeID = anEmployeeID;
        percentageComplete = 0;
        isLevelComplete = false;
    }

    public Progress(int anEmployeeID, Level aLevel, int aPercentageComplete) {
        level = aLevel;
        percentageComplete = aPercentageComplete;
        isLevelComplete = getIsLevelComplete();
    }

    public Level getLevel() {
        return level;
    }

    public void setLevel(Level aLevel) {
        level = aLevel;
    }

    public int getPercentageComplete() {
        return percentageComplete;
    }

    public void setPercentageComplete(int aPercentageComplete) {
        percentageComplete = aPercentageComplete;
    }

    public boolean getIsLevelComplete(){
        return percentageComplete == 100;
    }

    public void setIsLevelComplete(boolean aIsLevelComplete) {
        isLevelComplete = aIsLevelComplete;
    }

    public String toString(){

        return Integer.toString(percentageComplete);
    }


}