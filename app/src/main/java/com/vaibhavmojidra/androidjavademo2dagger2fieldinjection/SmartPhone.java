package com.vaibhavmojidra.androidjavademo2dagger2fieldinjection;

import android.util.Log;

import javax.inject.Inject;

public class SmartPhone {
    private Battery battery;

    @Inject
    public SmartPhone(Battery battery) {
        this.battery = battery;
        battery.isBatteryCharged();
        Log.i("MyTag","SmartPhone Class is initialized.");
    }

    void isSmartPhoneAvailable(){
        Log.i("MyTag","SmartPhone is available.");
    }
}
