package com.example.manoj.mysamples;

/**
 * Created by Manoj on 5/30/2018.
 */

public class MySingleton {
    private static MySingleton instance;

    MySingleton(){}

    public static MySingleton getInstance(){
        if(MySingleton.instance==null){
            MySingleton.instance=new MySingleton();
        }

        return MySingleton.instance;
    }
}
