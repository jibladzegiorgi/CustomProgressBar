package com.example.giorgi.customview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by GIorgi on 12/22/2016.
 */

public class CustomView extends View {

    private float textSize;
    private String suffix = "";
    private float suffixSize;
    private int textColor;
    private float maxProgress;

    private float progress = 0f;

    private int color = Color.BLACK;
    private int backgroundColor = Color.GREEN;
    private boolean rounded;
    private int alpha = 0;

    // Object used to draw
    private int startAngle = -90;
    private RectF rectF;
    private Paint backgroundPaint;
    private Paint foregroundPaint;
    private Paint kantPaint;

    Paint circleProgress;
    Paint rectangle;
    //Rect rectangle;


    public CustomView(Context context) {
        super(context);
        init();
    }


    public CustomView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public CustomView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public CustomView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        init();
    }

    private void init() {
        rectF = new RectF();

        backgroundPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
        backgroundPaint.setColor(backgroundColor);
//        if (alpha > 0) {
//            backgroundPaint.setAlpha(alpha);
//        } else {
           // backgroundPaint.setAlpha(255);
//        }
        backgroundPaint.setStyle(Paint.Style.FILL);
        //backgroundPaint.setStrokeWidth(200);
//
//        // Init Foreground
//        foregroundPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
//        foregroundPaint.setColor(color);
//        foregroundPaint.setStyle(Paint.Style.STROKE);
//
        kantPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
        kantPaint.setColor(Color.BLACK);
        kantPaint.setStyle(Paint.Style.STROKE);
//
//        if (rounded) {
//            foregroundPaint.setStrokeCap(Paint.Cap.ROUND);
//            kantPaint.setStrokeCap(Paint.Cap.ROUND);
//        }
//        foregroundPaint.setStrokeWidth(100);
        kantPaint.setStrokeWidth(100);
    }
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawOval(rectF, backgroundPaint);

        //canvas.draw
//        float angle = 360;
//
//        canvas.drawArc(rectF, startAngle + 2, -angle - 4, false, kantPaint);
        //canvas.drawArc(rectF, startAngle, -angle, true, foregroundPaint);

//        canvas.drawColor(Color.BLUE);
//        canvas.drawRect(rectangle,circleProgress);
    }
    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        final int height = getDefaultSize(getSuggestedMinimumHeight(), heightMeasureSpec);
        final int width = getDefaultSize(getSuggestedMinimumWidth(), widthMeasureSpec);
        final int min = Math.min(width, height);
        setMeasuredDimension(min, min);
        float highStroke = (2 > 1) ? 2 : 1;
        rectF.set(200,200,500,500);
    }
}
