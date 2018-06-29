package com.example.manoj.mysamples;

import android.util.Log;

/**
 * Created by Manoj on 5/29/2018.
 */

public class TestClass {
    static TestClass.ThreadB threadB;
    static ThreadC threadC;
    static ThreadD threadD;
    static ThreadE threadE;

    public int add(int a, int b){
        return a+b;
    }

    public int add(double a, double b){
        return (int)(a+b);
    }

    public void display(String str){
        if(str!=null && str.length()>0){

        }
    }

     static class ThreadA extends Thread{

         @Override
         public void run() {
             super.run();
             int i=10;
             while (i>0) {

                 try {
                     Thread.sleep(1000);
                     System.out.println("ThreadA");
                 } catch (InterruptedException e) {
                     e.printStackTrace();
                 }
                 i--;
             }
//             threadB.start();

         }
     }

    static class ThreadB extends Thread{

        @Override
        public void run() {
            super.run();
            int i = 10;
            while (i > 0) {
                try {
                    Thread.sleep(1000);
                    System.out.println("ThreadB");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                i--;
            }
        //threadC.start();
        }
    }

    static class ThreadC extends Thread{

        @Override
        public void run() {
            super.run();
            int i=10;
            while (i>0) {
                try {
                    Thread.sleep(1000);
                    System.out.println("ThreadC");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                i--;
            }
       // threadD.start();
        }
    }

    static class ThreadD extends Thread{

        @Override
        public void run() {
            super.run();
            int i = 10;
            while (i > 0) {
                try {
                    Thread.sleep(1000);
                    System.out.println("ThreadD");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                i--;
            }

      //  threadE.start();
        }
    }

    static class ThreadE extends Thread{

        @Override
        public void run() {
            super.run();
            int i = 10;
            while (i > 0) {
                try {
                    Thread.sleep(1000);
                    System.out.println("ThreadE");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                i--;
            }
        }
    }
}



class TestDemo{

    public static void main(String args[]){
        TestClass testClass=new TestClass();
        int c=testClass.add(10,10);
        System.out.println("C......... "+c);
        int d=testClass.add(15.0,10.0);
        System.out.println("D........ "+d);

       // testClass.display(null);

        TestClass.ThreadA threadA=new TestClass.ThreadA();
        TestClass.ThreadB threadB=new TestClass.ThreadB();
        TestClass.ThreadC threadC =new TestClass.ThreadC();
        TestClass.ThreadD threadD=new TestClass.ThreadD();
        TestClass.ThreadE threadE=new TestClass.ThreadE();



        try {
            threadA.start();
            threadA.join();

            threadB.start();
            threadB.join();

            threadC.start();
            threadC.join();

            threadD.start();
            threadD.join();

            threadE.start();
            threadE.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}