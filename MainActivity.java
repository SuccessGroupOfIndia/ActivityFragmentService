package com.example.manoj.mysamples;

import android.app.AlarmManager;
import android.app.AlertDialog;
import android.app.PendingIntent;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothHeadset;
import android.bluetooth.BluetoothProfile;
import android.content.BroadcastReceiver;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.AsyncTask;
import android.os.Environment;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.support.annotation.MainThread;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.channels.FileChannel;

public class MainActivity extends AppCompatActivity {
    BluetoothHeadset bluetoothHeadset;
    BluetoothAdapter bluetoothAdapter;
    TextView textView,textView2;
    BroadcastReceiver broadcastReceiver;
    IntentFilter intentFilter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        broadcastReceiver=new MyBroadcastReceiver();
        intentFilter=new IntentFilter();
        intentFilter.addAction("com.example.manoj.mysample");

        textView=(TextView)findViewById(R.id.textView);
        textView.setText("0");
        textView2=(TextView)findViewById(R.id.textView2);
        textView2.setText("0");

        bluetoothAdapter=BluetoothAdapter.getDefaultAdapter();

        if(bluetoothAdapter==null){
            //Bluetooth Not Supported

            return;
        }

        if(!bluetoothAdapter.isEnabled()){
            Intent enableBtIntent = new Intent(BluetoothAdapter.ACTION_REQUEST_ENABLE);
            startActivityForResult(enableBtIntent, 1000);
        }

        BluetoothProfile.ServiceListener serviceListener=new BluetoothProfile.ServiceListener() {
            @Override
            public void onServiceConnected(int profile, BluetoothProfile proxy) {
                if(profile==BluetoothProfile.HEADSET) {
                    bluetoothHeadset = (BluetoothHeadset) proxy;
                }
            }

            @Override
            public void onServiceDisconnected(int profile) {
                if(profile==BluetoothProfile.HEADSET){
                    bluetoothHeadset=null;
                }
            }
        };

        bluetoothAdapter.getProfileProxy(this,serviceListener,BluetoothProfile.HEADSET);
        bluetoothAdapter.closeProfileProxy(BluetoothProfile.HEADSET,bluetoothHeadset);


        Handler handler=new Handler(Looper.getMainLooper()){
            @Override
            public String getMessageName(Message message) {
                return super.getMessageName(message);
            }
        };

        Log.e("Oncreate", "onCreate");


        ((Button) findViewById(R.id.click_here)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MyService.class);
                intent.putExtra("from", "MainActivity");
                startService(intent);
                startService(intent);
                startService(intent);
                //showDialog();

                /*MyAsyncTask myAsyncTask=new MyAsyncTask();
                myAsyncTask.execute();*/

              //  startService(new Intent(MainActivity.this,MyIntentService.class));

               /* Intent intent1= new Intent(MainActivity.this,MyBroadcastReceiver.class);
                PendingIntent pendingIntent=PendingIntent.getBroadcast(MainActivity.this,0,intent1,0);
                AlarmManager alarmManager=(AlarmManager)getSystemService(Context.ALARM_SERVICE);
                alarmManager.set(AlarmManager.RTC_WAKEUP,System.currentTimeMillis()+3000,pendingIntent);
*/



               /* Intent intent1=new Intent("com.example.manoj.mysample");
                sendBroadcast(intent1);*/
            }
        });

       // _getProfileDB();
    }

    class MyAsyncTask extends AsyncTask{

        @Override
        protected Object doInBackground(Object[] objects) {
           /* runOnUiThread(new Runnable() {
                @Override
                public void run() {
                    textView.setText("100");
                    textView2.setText("200");
                }
            });*/

           new Handler().post(new Runnable() {
               @Override
               public void run() {
                   textView.setText("100");
                   textView2.setText("200");
               }
           });

            return null;
        }
    }


    private void showDialog(){
        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
        builder.setMessage("Dialog").setTitle("Hiiiiiiiiii");
        AlertDialog dialog = builder.create();
        dialog.show();
    }
    public void _getProfileDB() {
        try {
            File sd = Environment.getExternalStorageDirectory();
            File data = Environment.getDataDirectory();

            if (data.canWrite()) {
                String currentDBPath = "/data/data/" + getPackageName() + "/databases/abc.db";
                String backupDBPath = "pqr.db";
                File currentDB = new File(currentDBPath);
                File backupDB = new File(sd, backupDBPath);

                if (currentDB.exists()) {
                    FileChannel src = new FileInputStream(currentDB).getChannel();
                    FileChannel dst = new FileOutputStream(backupDB).getChannel();
                    dst.transferFrom(src, 0, src.size());
                    src.close();
                    dst.close();
                }
            }
        } catch (Exception e) {

        }
    }


    @Override
    protected void onStart() {
        super.onStart();
        Log.e("onStart", "onStart");
    }

    @Override
    protected void onResume() {

        super.onResume();
        Log.e("onResume", "onResume");
        registerReceiver(broadcastReceiver,intentFilter);

    }

    @Override
    protected void onPause() {
        unregisterReceiver(broadcastReceiver);
        super.onPause();
        Log.e("onPause", "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e("onStop", "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("onDestroy", "onDestroy");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e("onRestart", "onRestart");
    }
}
