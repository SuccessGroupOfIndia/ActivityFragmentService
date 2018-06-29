package com.example.manoj.mysamples;

/**
 * Created by Manoj on 6/12/2018.
 */

public class MyTest implements ABC , XYZ{

    @Override
    public void display() {
       System.out.println("Hello...............");
    }

    public static void main(String args[]){
        MyTest myTest=new MyTest();

        myTest.display();

    }
}

interface ABC {
    void display();
}

interface XYZ {
    void display();
}
