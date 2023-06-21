package com.vaibhavmojidra.androidjavademo2dagger2fieldinjection;

import android.util.Log;

import javax.inject.Inject;

public class Game {
    @Inject
    public Game() {
        Log.i("MyTag","Game Class is initialized.");
    }

    void isGameDownloaded(){
        Log.i("MyTag","Game is already downloaded.");
    }
}
