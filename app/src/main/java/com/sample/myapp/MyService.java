package com.sample.myapp;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

// http://android.keicode.com/basics/services-simple.php
// https://techbooster.org/android/application/3270/

public class MyService extends Service{

    static final String TAG = "MyService";

    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        Log.d(TAG, "onCreate");
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Log.d(TAG, "onStartCommand");
        return START_NOT_STICKY;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy");
    }
}
