package com.robotsandpencils.androidarchitecturelifecyclepractice.viewmodel;

import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.LifecycleObserver;
import android.arch.lifecycle.OnLifecycleEvent;
import android.util.Log;

/**
 * Created by pwray on 2017-11-07.
 */

public class MyObserver implements LifecycleObserver {

    private static final String LOG_TAG = MyObserver.class.getSimpleName();

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public void onResume() {
        Log.d(LOG_TAG, "resumed observing lifecycle");
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public void onPause() {
        Log.d(LOG_TAG, "paused observing lifecycle");
    }
}
