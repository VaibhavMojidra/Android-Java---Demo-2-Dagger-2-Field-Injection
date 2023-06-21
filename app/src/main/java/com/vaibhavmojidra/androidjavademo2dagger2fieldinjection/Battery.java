package com.vaibhavmojidra.androidjavademo2dagger2fieldinjection;

import android.util.Log;

import javax.inject.Inject;

public class Battery {
    @Inject
    public Battery() {
        Log.i("MyTag","Battery Class is initialized.");
    }
    void isBatteryCharged(){
        Log.i("MyTag","Battery is fully charged.");
    }
}
