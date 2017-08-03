package com.everbright.wangyusen.ricochetw;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import info.hoang8f.widget.FButton;

public class MainActivity extends AppCompatActivity {
    private FButton moveLeft;
    private FButton moveRight;
    private FButton moveUp;
    private FButton moveDown;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initializeMoveButtons();
    }

    /**
     * initialize left right up down buttons
     */
    public void initializeMoveButtons(){
        moveRight = (FButton) findViewById(R.id.right_button);
        moveDown = (FButton) findViewById(R.id.down_button);
        moveUp = (FButton) findViewById(R.id.up_button);
        moveLeft = (FButton) findViewById(R.id.left_button);
        moveLeft.setText("left");
        moveRight.setText("right");
        moveUp.setText("up");
        moveDown.setText("down");
    }
}
