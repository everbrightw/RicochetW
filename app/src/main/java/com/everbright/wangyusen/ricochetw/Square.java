package com.everbright.wangyusen.ricochetw;

/**
 * Created by wangyusen on 8/1/17.
 */

public class Square {
    public boolean upWall;
    public boolean downWall;
    public boolean leftWall;
    public boolean rightWall;
    public boolean hasRobot;
    private int x;
    private int y;

    Square(int x, int y){
        this.x = x;
        this.y = y;
        upWall = false;downWall = false;leftWall = false;rightWall = false;
    }


}
