package com.robotsandpencils.androidarchitecturelifecyclepractice.viewmodel;

import android.arch.lifecycle.ViewModel;
import android.arch.lifecycle.ViewModelProvider;
import android.support.annotation.NonNull;

/**
 * Created by pwray on 2017-11-07.
 */

public class LoggingClickCounterViewModelFactory implements ViewModelProvider.Factory {

    private final ClickLoggingInterceptor loggingInterceptor;

    public LoggingClickCounterViewModelFactory(ClickLoggingInterceptor loggingInterceptor) {
        this.loggingInterceptor = loggingInterceptor;
    }

    @NonNull
    @Override
    public <T extends ViewModel> T create(@NonNull Class<T> modelClass) {
        if(modelClass.isAssignableFrom(LoggingClickCounterViewModel.class)) {
            return (T) new LoggingClickCounterViewModel(loggingInterceptor);
        }
        throw new IllegalArgumentException("Unknown ViewModel class");
    }
}
