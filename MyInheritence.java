package com.example.manoj.mysamples;

/**
 * Created by Manoj on 6/14/2018.
 */

public class MyInheritence implements A,B{

    @Override
    public void display() {
       /* MyInheritence inheritence=new MyInheritence();
        if(inheritence instanceof A){
         System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAAA");
        }

        if(inheritence instanceof B){
            System.out.println("BBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBB");
        }*/

    }

    public static void main(String args[]){
        MyInheritence inheritence=new MyInheritence();
        ((A)inheritence).display();
        ((B)inheritence).display();
    }

}

interface A{
    void display();
}

interface B{
    void display();
}
