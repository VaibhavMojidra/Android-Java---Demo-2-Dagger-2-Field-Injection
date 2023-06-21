package com.vaibhavmojidra.androidjavademo2dagger2fieldinjection;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {
    @Inject
    SmartPhone smartPhone;

    @Inject
    PlayGame playGame;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DaggerPlayGameComponent.create().inject(this);

        playGame.playGame();

        Log.i("MyTag","--------");

        smartPhone.isSmartPhoneAvailable();

    }
}