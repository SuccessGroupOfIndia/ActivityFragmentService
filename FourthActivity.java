package com.example.manoj.mysamples;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

/**
 * Created by Manoj on 5/4/2018.
 */

public class FourthActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fourth);

        Log.e("Oncreate4","onCreate");
        ((Button)findViewById(R.id.fourth_click_here)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(FourthActivity.this,MainActivity.class);
                intent.putExtra("from","FourthActivity");
                startActivity(intent);
                finishAffinity();
            }
        });

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e("onStart4","onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e("onResume4","onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e("onPause4","onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e("onStop4","onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("onDestroy4","onDestroy");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e("onRestart4","onRestart");
    }
}
