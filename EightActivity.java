package com.example.manoj.mysamples;

import android.app.Fragment;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

/**
 * Created by Manoj on 5/4/2018.
 */

public class EightActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.eight);

        Log.e("Oncreate8","onCreate");

        Fragment fragment=new FirstFragment();
        getFragmentManager().beginTransaction().add(R.id.container,fragment).addToBackStack(null).commit();


    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e("onStart8","onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e("onResume8","onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e("onPause8","onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e("onStop8","onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("onDestroy8","onDestroy");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e("onRestart8","onRestart");
    }
}
