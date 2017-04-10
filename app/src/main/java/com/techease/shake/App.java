package com.techease.shake;

import android.app.Application;
import android.content.Intent;

/**
 * Created by kaxhiftaj on 4/9/17.
 */

public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        startService(new Intent(this, RSSPullService.class));
    }
}