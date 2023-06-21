package com.vaibhavmojidra.androidjavademo2dagger2fieldinjection;

import dagger.Component;

@Component
public interface PlayGameComponent {
    void inject(MainActivity mainActivity);
}
