package com.everbright.wangyusen.ricochetw;

/**
 * Created by wangyusen on 8/1/17.
 */

public class Map {
    public static Square[][] map = new Square[16][16];

    public static void initializeMap(Square[][] map){
        for (int x = 0; x< 16; x ++){
            for(int y = 0; y < 16; y++){
                map[x][y] = new Square(x,y);
            }
        }
    }

}
