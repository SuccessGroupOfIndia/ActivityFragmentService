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

public class SixthActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.six);

        Log.e("Oncreate6","onCreate");

        ((Button)findViewById(R.id.six_click_here)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(SixthActivity.this,SeventhActivity.class);
                intent.putExtra("from","SixthActivity");
                startActivity(intent);
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e("onStart6","onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e("onResume6","onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e("onPause6","onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e("onStop6","onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("onDestroy6","onDestroy");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e("onRestart6","onRestart");
    }
}
