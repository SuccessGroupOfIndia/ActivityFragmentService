package com.example.manoj.mysamples;

/**
 * Created by Manoj on 6/13/2018.
 */

public class MyPrinter {
    boolean isOdd = false;

    public synchronized void printEvenNumber(int number) {
        while (isOdd == false) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println(number);
        isOdd = false;
        notifyAll();
    }

    public synchronized void printOddNumber(int number) {
        while (isOdd == true) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println(number);
        isOdd = true;
        notifyAll();
    }
}

class MyThreadEvenOddNumberPrint {
    public static void main(String args[]) {
        MyPrinter myPrinter = new MyPrinter();
        Thread t1 = new Thread(new MyThreads(myPrinter, 10, false));
        Thread t2 = new Thread(new MyThreads(myPrinter, 10, true));

        t1.start();
        t2.start();
    }
}