package com.btk.observerdesignpattern;

import android.util.Log;

public class FirstObserver extends Observer {

    private final String TAG = FirstObserver.class.getSimpleName();

    public FirstObserver() {
    }

    public FirstObserver(Subject subject) {
        subject.addObserver(this);
    }

    @Override
    public void show() {
        Log.v(TAG,"=== Show the message from FirstObserver:");
    }
}
