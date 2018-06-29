package com.example.manoj.mysamples;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

/**
 * Created by Manoj on 6/13/2018.
 */

public class MyBroadcastReceiver extends BroadcastReceiver{
    @Override
    public void onReceive(Context context, Intent intent) {
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
        Intent intent1=new Intent(context,SecondActivity.class);
        context.startActivity(intent1);

    }
}
