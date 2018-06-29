package com.example.manoj.mysamples;

import android.app.Activity;
import android.app.IntentService;
import android.content.Intent;
import android.support.annotation.Nullable;
import android.util.Log;

import java.util.logging.Handler;

/**
 * Created by Manoj on 6/2/2018.
 */

public class MyIntentService extends IntentService{
    /**
     * Creates an IntentService.  Invoked by your subclass's constructor.
     *
     * @ name Used to name the worker thread, important only for debugging.
     */
    public MyIntentService() {
        super("MyIntentService");
    }

    @Override
    protected void onHandleIntent(@Nullable Intent intent) {
        int i=0;
       while (i<=10){

           try {
               Log.e("Hello",""+i);
               Thread.sleep(500);
           }catch (Exception e){
               e.printStackTrace();
           }


           i++;
       }
       Intent intent1=new Intent(MyIntentService.this,SecondActivity.class);
       startActivity(intent1);

    }
}
