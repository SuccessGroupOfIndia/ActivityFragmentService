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

public class ThirdActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.third);

        Log.e("Oncreate3","onCreate");
        ((Button)findViewById(R.id.third_click_here)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(ThirdActivity.this,FourthActivity.class);
                intent.putExtra("from","ThirdActivity");
                startActivity(intent);
            }
        });

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e("onStart3","onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e("onResume3","onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e("onPause3","onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e("onStop3","onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("onDestroy3","onDestroy");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e("onRestart3","onRestart");
    }
}
