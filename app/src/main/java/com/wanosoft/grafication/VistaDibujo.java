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

    //onDraw es un método sobreescribible que permite dibujar, es provisto por la clase Canvas
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setColor(Color.BLUE);
        paint.setStrokeWidth(10);

        //Chasis
        paint.setColor(Color.GRAY);
        canvas.drawRect(new RectF(250,350,700,600),paint);
        paint.setColor(Color.GRAY);
        canvas.drawRect(new RectF(150,600,900,800),paint);


        //Llanta trasera
        paint.setColor(Color.BLACK);
        canvas.drawCircle(200,800,100,paint);
        paint.setColor(Color.WHITE);
        canvas.drawCircle(200,800,30,paint);

        //Llanta delantera
        paint.setColor(Color.BLACK);
        canvas.drawCircle(850,800,100,paint);
        paint.setColor(Color.WHITE);
        canvas.drawCircle(850,800,30,paint);
    }
}
