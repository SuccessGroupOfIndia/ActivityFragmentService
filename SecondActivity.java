package com.example.manoj.mysamples;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.List;

/**
 * Created by Manoj on 5/4/2018.
 */

public class SecondActivity extends AppCompatActivity {
    DatabaseHelper databaseHelper;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second);

        databaseHelper=new DatabaseHelper(this);

        final Employee employee=new Employee();
        final EditText etName=(EditText)findViewById(R.id.editText);
        final EditText etSalary=(EditText)findViewById(R.id.editText2);
        final EditText etQualification=(EditText)findViewById(R.id.editText3);
        final EditText etAge=(EditText)findViewById(R.id.editText4);




        Log.e("Oncreate2","onCreate");

       /* ((Button)findViewById(R.id.second_click_here)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(SecondActivity.this,ThirdActivity.class);
                intent.putExtra("from","SecondActivity");
                startActivity(intent);
            }
        });*/

        ((Button)findViewById(R.id.second_click_here)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                List<Employee> employeeList=databaseHelper.getEmployeeList();

                for(int i=0;i<employeeList.size();i++){
                    Log.e("Employee"+i,employeeList.get(i).getId()+" , "+employeeList.get(i).getName()+" , "+employeeList.get(i).getSalary()+" , "+employeeList.get(i).getQualification());
                }
            }
        });

        ((Button)findViewById(R.id.btn)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                employee.setName(etName.getText().toString());
                employee.setSalary(Integer.parseInt(etSalary.getText().toString()));
                employee.setQualification(etQualification.getText().toString());
                employee.setAge(Integer.parseInt(etAge.getText().toString()));
                init(employee);
            }
        });
    }

    private void init(Employee employee){

        databaseHelper.insertRecord(employee);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e("onStart2","onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e("onResume2","onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e("onPause2","onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e("onStop2","onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("onDestroy2","onDestroy");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e("onRestart2","onRestart");
    }
}
