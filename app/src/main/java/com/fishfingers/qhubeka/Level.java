package com.fishfingers.qhubeka;

/********
 Date: 12/09/2020
 Author: Yolisa Nogantshi
 Package: Fish-fingers Qhubeka App
 Description: Level class

 Tree?
 ********/

public class Level{
    boolean isCheckPoint;
    int levelNumber;
    int subLevelNumber;

    public Level(){
        isCheckPoint = false;
        levelNumber = 0;
        subLevelNumber = 0;
    }

    public Level(boolean aIsCheckPoint, int aLevelNumber, int aSubLevelNumber) {
        isCheckPoint = aIsCheckPoint;
        levelNumber = aLevelNumber;
        subLevelNumber = aSubLevelNumber;
    }
}