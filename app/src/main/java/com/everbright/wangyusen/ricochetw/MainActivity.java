package com.everbright.wangyusen.ricochetw;

import android.content.Context;
import android.graphics.PixelFormat;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import info.hoang8f.widget.FButton;

public class MainActivity extends AppCompatActivity {
    private FButton moveLeft;
    private FButton moveRight;
    private FButton moveUp;
    private FButton moveDown;
    private TextView blue_robot;

    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initializeMoveButtons();
        initializeBlueRobot();

        blue_robot.setLayoutParams(getParams(0,0));
//        ImageView test = (ImageView) findViewById(R.id.test);
        ImageView test = (ImageView) findViewById(R.id.imageView2);
        Log.i("testx", String.valueOf(test.getLayoutParams().height));
        Log.i("tesxy", String.valueOf(test.getLayoutParams().width));
//        MainActivity.this.addContentView(test, params);

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
        moveRight.setCornerRadius(0);
        moveUp.setCornerRadius(0);
        moveLeft.setCornerRadius(0);
        moveDown.setCornerRadius(0);
    }

    @RequiresApi(api = Build.VERSION_CODES.M)
    public void initializeBlueRobot(){
        blue_robot  = (TextView) findViewById(R.id.blue_robot);
        blue_robot.setTypeface(FontManager.getTypeface(this, FontManager.FONTAWESOME));
        blue_robot.setText(R.string.fa_icon_car);
        blue_robot.setTextColor(this.getColor(R.color.fbutton_default_color));

    }

    public ConstraintLayout.LayoutParams getParams(int xPosition, int yPosition){
        ConstraintLayout.LayoutParams params = new ConstraintLayout.LayoutParams(350,350);

//        params.rightToRight = R.id.imageView;
//        params.topToTop = R.id.imageView;
//        params.leftToLeft = R.id.imageView;
//        params.bottomToBottom = R.id.imageView;
        params.height = 1600;

        return params;
    }
    public View initializeView(Context context, int mLayout){
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        return inflater.inflate(mLayout, null);
    }
}
