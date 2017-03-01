package com.wanosoft.grafication;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;

/**
 * Created by upam on 01/03/17.
 */

public class VistaDibujo extends View {
    public VistaDibujo(Context context) {
        super(context);
    }

    private int width = 0, height = 0;
    private int wc=0,hc=0;
    private int px=0,py=0;

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setColor(Color.BLUE);
        paint.setStrokeWidth(10);

        width=getWidth();
        height = getHeight();
        paint.setColor(Color.RED);

        px=(width/2)-(wc/2);
        canvas.drawLine(0,0,100,100,paint);
        canvas.drawRect(new RectF(180,20,220,80),paint);
    }
}
