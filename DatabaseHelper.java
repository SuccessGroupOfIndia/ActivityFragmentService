package com.example.manoj.mysamples;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Manoj on 6/3/2018.
 */

public class DatabaseHelper extends SQLiteOpenHelper {
    private static final String db_name = "abc.db";
    private static final String table_name = "employee";
    private SQLiteDatabase database;
    private Context context;

    public DatabaseHelper(Context context) {
        super(context, db_name, null, 2);
        this.context = context;
    }


    public void openDb() {
        database = getWritableDatabase();
    }

    @Override
    public synchronized void close() {
        super.close();
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String query = "Create table " + table_name + " ( Id INTEGER PRIMARY KEY AUTOINCREMENT , Name Text , Salary Integer , qualification Text )";
        db.execSQL(query);

    }

    public void insertRecord(Employee employee) {
        openDb();
        ContentValues contentValues = new ContentValues();
        contentValues.put("Name", employee.getName());
        contentValues.put("Salary", employee.getSalary());
        contentValues.put("qualification", employee.getQualification());

        long id = database.insert(table_name, null, contentValues);
        if (id > -1) {
            Log.e("Idd", id + "");
        }
        close();

    }

    public List<Employee> getEmployeeList() {
        List<Employee> employees = new ArrayList<>();
        String sql = "Select * from " + table_name;
        openDb();
        Cursor cursor = database.rawQuery(sql, null);
        cursor.moveToFirst();

        while (!cursor.isAfterLast()) {
            Employee employee = new Employee();
            employee.setId(cursor.getInt(cursor.getColumnIndex(cursor.getColumnName(0))));
            employee.setName(cursor.getString(cursor.getColumnIndex(cursor.getColumnName(1))));
            employee.setSalary(cursor.getInt(cursor.getColumnIndex(cursor.getColumnName(2))));
            employee.setQualification(cursor.getString(cursor.getColumnIndex(cursor.getColumnName(3))));
            employee.setAge(cursor.getInt(cursor.getColumnIndex(cursor.getColumnName(4))));
            employees.add(employee);
            cursor.moveToNext();
        }
        close();
        return employees;
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        String query = "ALTER TABLE " + table_name + " ADD COLUMN " + "Age" + " Integer default 20";
        if (oldVersion == 1) {
            db.execSQL(query);
        }
    }
}
