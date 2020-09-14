package com.fishfingers.qhubeka;

/********
 Date: 12/09/2020
 Author: Yolisa Nogantshi
 Package: Fish-fingers Qhubeka App
 Description: Level class

 Tree?
 ********/

public class Level{

    int levelNumber;
    String levelName;
    //Level nextLevel; // link to the next level (for singly-linked list implementation)


    /****
     *to be implemented later - keeping it simple for now
     int subLevelNumber;
     int noOfSubs;
     boolean isCheckPoint;
     *****/

    public Level(){

        levelNumber = 0;
        levelName = null;
        // nextLevel = new Level(1, "Induction");
        //subLevelNumber = 0;
        //isCheckPoint = false;
    }

    public Level(int aLevelNumber) {

        levelNumber = aLevelNumber;

        setLevelName(aLevelNumber);
        //nextLevel = new Level(aLevelNumber+1, null);

    	/*
    	isCheckPoint = aIsCheckPoint;
        subLevelNumber = aSubLevelNumber;
        */
    }

    public String toString() {

        return "Level " + levelNumber + ": " + levelName;
    }


    public void setLevelName(int aLevelNumber) {

    	/*
    	switch(aLevelNumber) {
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

    	}*/
    }


}