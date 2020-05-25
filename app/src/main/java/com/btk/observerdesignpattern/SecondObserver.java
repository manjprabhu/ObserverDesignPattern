package com.btk.observerdesignpattern;

import android.util.Log;

public class SecondObserver extends Observer {

    private final String TAG = SecondObserver.class.getSimpleName();

    public SecondObserver() {
    }

    public SecondObserver(Subject subject) {
        subject.addObserver(this);
    }

    @Override
    public void show() {
        Log.v(TAG,"=== Show the message from SecondObserver");

    }
}
