package com.kaushikthedeveloper.squarelayoutexample;

import android.database.sqlite.SQLiteAbortException;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;

import com.kaushikthedeveloper.squarelayout.*;

public class MainActivity extends AppCompatActivity {

    private SquareLinearLayout squareLinearLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        squareLinearLayout = (SquareLinearLayout) findViewById(R.id.square);
    }

    @Override
    public void onWindowFocusChanged(boolean hasFocus) {
        super.onWindowFocusChanged(hasFocus);

//        SquareLinearLayout.LayoutParams params = (SquareLinearLayout.LayoutParams) squareLinearLayout.getLayoutParams();
        LinearLayout.LayoutParams p = (LinearLayout.LayoutParams) squareLinearLayout.getLayoutParams();
        p.height = squareLinearLayout.getWidth();
//        //Set Height = Width for Button View
        squareLinearLayout.setLayoutParams(p);
        squareLinearLayout.requestLayout();

//        squareLinearLayout.getWidth();
//        squareLinearLayout.getHeight();

    }

}