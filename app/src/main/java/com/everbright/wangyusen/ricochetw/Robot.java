package com.everbright.wangyusen.ricochetw;

/**
 * Created by wangyusen on 8/1/17.
 */

public class Robot {
    private String color;
    private int currentX;
    private int currntY;
    private String currentTask;// target destination
    Robot(){

    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

}
