package com.yalin.assertions;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void checkArgument(View view) {
        checkArgument(2);
    }

    public void checkIndex(View view) {
        checkIndex(4);
    }

    public void checkState(View view) {
        checkState(INVALID_STATE);
    }

    public void checkNotNull(View view) {
        Object object = null;
        checkNotNull(object);
    }

    public void checkNotEmpty(View view) {
        String string = "";
        checkNotEmpty(string);
    }

    public void checkMainThread(View view) {
        checkMainThread();
    }

    void checkArgument(int argument) {
        Assertions.checkArgument(argument == 3);
    }

    void checkIndex(int index) {
        String[] strings = new String[]{"1", "2", "3"};
        Assertions.checkIndex(index, 0, strings.length);
    }

    static final int VALID_STATE = 10;
    static final int INVALID_STATE = 11;

    void checkState(int state) {
        Assertions.checkState(state == VALID_STATE);
    }

    void checkNotNull(Object obj) {
        Assertions.checkNotNull(obj);
    }

    void checkNotEmpty(String string) {
        Assertions.checkNotEmpty(string);
    }

    void checkMainThread() {
        Assertions.checkMainThread();
    }
}
