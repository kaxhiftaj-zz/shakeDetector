package com.techease.shake;

import android.app.IntentService;
import android.app.Service;
import android.content.Intent;

/**
 * Created by kaxhiftaj on 4/9/17.
 */

public class RSSPullService extends IntentService{

    public RSSPullService(String name) {
        super(name);
    }

    @Override
    protected void onHandleIntent(Intent workIntent) {
        // Gets data from the incoming Intent
        String dataString = workIntent.getDataString();

       startService(new Intent(dataString));
    }
}
