package com.vaibhavmojidra.androidjavademo2dagger2fieldinjection;

import android.util.Log;

import javax.inject.Inject;

public class PlayGame {
    private SmartPhone smartPhone;
    private Game game;

    @Inject
    public PlayGame(SmartPhone smartPhone, Game game) {
        this.smartPhone = smartPhone;
        this.game = game;
        game.isGameDownloaded();
        smartPhone.isSmartPhoneAvailable();
        Log.i("MyTag","PlayGame Class is initialized.");
    }

    void playGame(){
        Log.i("MyTag","Starting game...");
    }

}
