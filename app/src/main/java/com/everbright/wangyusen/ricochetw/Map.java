package com.everbright.wangyusen.ricochetw;

/**
 * Created by wangyusen on 8/1/17.
 */

public class Map {
    //Todo add a button to randomize robots 2. randomize function 3 . reset function 4. Robot::moveleftrightupdown 5. bool return true hasArrived() 6. Sqaure::hasWall() 7.

    public Square[][] map = new Square[16][16];

    public static void initializeMap(Square[][] map){
        for (int x = 0; x< 16; x ++){
            for(int y = 0; y < 16; y++){
                map[x][y] = new Square(x,y);
            }
        }
    }


    public void randomizeRobots(Square[][] map){

    }
    public void resetRobots(Square[][] map){

    }






}
