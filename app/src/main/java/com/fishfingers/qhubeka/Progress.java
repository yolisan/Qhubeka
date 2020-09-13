package com.fishfingers.qhubeka;

/********
 Date: 12/09/2020
 Author: Yolisa Nogantshi
 Package: Fish-fingers Qhubeka App
 Description: Progress class with attributes regarding employee's progress
 ********/

public class Progress{

    Level level;
    float percentageComplete;
    boolean isLevelComplete;

    public Progress(){
        level = new Level();
        percentageComplete = 0;
        isLevelComplete = false;
    }

    public Progress(Level aLevel, float aPercentageComplete, boolean aIsLevelComplete) {
        level = aLevel;
        percentageComplete = aPercentageComplete;
        isLevelComplete = aIsLevelComplete;
    }

    public Level getLevel() {
        return level;
    }

    public void setLevel(Level aLevel) {
        level = aLevel;
    }

    public float getPercentageComplete() {
        return percentageComplete;
    }

    public void setPercentageComplete(float aPercentageComplete) {
        percentageComplete = aPercentageComplete;
    }

    public boolean getIsLevelComplete(){
        return isLevelComplete;
    }

    public void setIsLevelComplete(boolean aIsLevelComplete) {
        isLevelComplete = aIsLevelComplete;
    }


}