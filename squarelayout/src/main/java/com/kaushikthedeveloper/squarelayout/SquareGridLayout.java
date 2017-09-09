package com.kaushikthedeveloper.squarelayout;

import android.content.Context;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.GridLayout;

public class SquareGridLayout extends GridLayout {

    public SquareGridLayout(Context context) {
        super(context);
    }

    public SquareGridLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public SquareGridLayout(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public SquareGridLayout(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    /**
     * Measure the view and its content to determine the measured width and the measured height.
     * @param widthMeasureSpec :  horizontal space requirements as imposed by the parent
     * @param heightMeasureSpec :  vertical space requirements as imposed by the parent
     */
    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        init();
        super.onMeasure(widthMeasureSpec,heightMeasureSpec);
    }

    /**
     * Callback method to be invoked when the view tree is about to be drawn.
     * At this point, all views in the tree have been measured and given a frame.
     * So calculate the bounds before rendering the layout.
     */
    private void init() {
        this.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() {
            @Override
            public boolean onPreDraw() {

                if (getWidth() != getHeight()) {
                    //Get the smaller dimension of height and width
                    int squareSize = Math.min(getWidth(), getHeight());

                    //Set the dimensions to a Square
                    ViewGroup.LayoutParams lp = getLayoutParams();
                    lp.width = squareSize;
                    lp.height = squareSize;
                    requestLayout();
                    return false;
                }
                return true;

            }
        });
    }

}
