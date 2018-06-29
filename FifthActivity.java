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

public class FifthActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fifth);

        Log.e("Oncreate5","onCreate");

        ((Button)findViewById(R.id.fifth_click_here)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(FifthActivity.this,SixthActivity.class);
                intent.putExtra("from","FifthActivity");
                startActivity(intent);
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e("onStart5","onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e("onResume5","onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e("onPause5","onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e("onStop5","onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("onDestroy5","onDestroy");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e("onRestart5","onRestart");
    }
}
