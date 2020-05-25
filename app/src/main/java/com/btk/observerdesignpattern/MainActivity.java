package com.btk.observerdesignpattern;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        createObserver();
    }

    private void createObserver() {

        Subject subject = new Subject();

        FirstObserver firstObserver = new FirstObserver(subject);

        SecondObserver secondObserver = new SecondObserver(subject);

        subject.update();

    }

}
