package com.kaushikthedeveloper.squarelayout;

import android.content.Context;
import android.support.percent.PercentFrameLayout;
import android.util.AttributeSet;

import static java.lang.Math.abs;

//Deprecated since Support library 26.0
@Deprecated
public class SquarePercentFrameLayout extends PercentFrameLayout {
    public SquarePercentFrameLayout(Context context) {
        super(context);
    }

    public SquarePercentFrameLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public SquarePercentFrameLayout(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    /**
     * Used to temper the Layout Measurements into square before rendering
     * Based on the side having shorter length
     * @param widthMeasureSpec : original width
     * @param heightMeasureSpec : original height
     */
    @SuppressWarnings("SuspiciousNameCombination")
    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {

        // if height < width : call super method with heightSpec for all sides
        if (abs(heightMeasureSpec) < abs(widthMeasureSpec)) {
            super.onMeasure(heightMeasureSpec, heightMeasureSpec);
        }

        // if width <= height : call super method with widthSpec for all sides
        else {
            super.onMeasure(widthMeasureSpec, widthMeasureSpec);
        }
    }

}
