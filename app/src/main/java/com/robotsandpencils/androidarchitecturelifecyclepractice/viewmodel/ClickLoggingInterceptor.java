package com.robotsandpencils.androidarchitecturelifecyclepractice.viewmodel;

import android.util.Log;

/**
 * Created by pwray on 2017-11-07.
 */

public class ClickLoggingInterceptor {

    private static final String LOG_TAG = ClickLoggingInterceptor.class.getSimpleName();

    public void intercept(int clickCount) {
        Log.d(LOG_TAG, "processed click" + clickCount);
    }
}
