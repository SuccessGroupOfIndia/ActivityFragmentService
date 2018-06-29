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

public class SeventhActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.seven);

        Log.e("Oncreate7","onCreate");

        ((Button)findViewById(R.id.seven_click_here)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(SeventhActivity.this,EightActivity.class);
                intent.putExtra("from","SeventhActivity");
                startActivity(intent);
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e("onStart7","onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e("onResume7","onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e("onPause7","onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e("onStop7","onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("onDestroy7","onDestroy");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e("onRestart7","onRestart");
    }
}
