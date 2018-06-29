package com.example.manoj.mysamples;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.Nullable;

/**
 * Created by Manoj on 5/6/2018.
 */

public class MyService extends Service{
    @Override
    public void onCreate() {
        super.onCreate();
        System.out.println("print ... onCreate()");
    }

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        for(int i=1;i<10;i++){
            System.out.println("print ... "+i+Thread.currentThread().getName());

        }


        return START_NOT_STICKY;
    }
}
