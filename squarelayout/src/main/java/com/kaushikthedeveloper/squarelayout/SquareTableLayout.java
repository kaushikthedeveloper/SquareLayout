package com.kaushikthedeveloper.squarelayout;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TableLayout;

public class SquareTableLayout extends TableLayout {
    public SquareTableLayout(Context context) {
        super(context);
    }

    public SquareTableLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
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
        if (heightMeasureSpec < widthMeasureSpec) {
            super.onMeasure(heightMeasureSpec, heightMeasureSpec);
        }

        // if width <= height : call super method with widthSpec for all sides
        else {
            super.onMeasure(widthMeasureSpec, widthMeasureSpec);
        }
    }

}
