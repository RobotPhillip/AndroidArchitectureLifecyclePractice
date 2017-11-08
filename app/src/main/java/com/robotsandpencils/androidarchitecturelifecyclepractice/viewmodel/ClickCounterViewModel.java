package com.robotsandpencils.androidarchitecturelifecyclepractice.viewmodel;

import android.arch.lifecycle.ViewModel;

/**
 * Created by pwray on 2017-11-07.
 */

public class ClickCounterViewModel extends ViewModel {

    private int count;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }


}
