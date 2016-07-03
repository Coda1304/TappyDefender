package com.adrian.c1tappydefender;

import android.content.Context;
import android.view.SurfaceView;

/**
 * Created by Adrian on 02/07/16.
 */
public class TDView extends SurfaceView implements
        Runnable {

    public TDView(Context context) {
        super(context);
    }

    @Override
    public void run() {
        while (playing) {
            update();
            draw();
            control();
        }
    }

}
