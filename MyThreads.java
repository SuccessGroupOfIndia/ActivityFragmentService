package com.example.manoj.mysamples;

/**
 * Created by Manoj on 6/12/2018.
 */

public class MyThreads implements Runnable{
    MyPrinter myPrinter;
    int max;
    boolean evenOddNumber=false;
    public MyThreads(MyPrinter printer,int max,boolean evenOddNumber){
        this.myPrinter=printer;
        this.max=max;
        this.evenOddNumber=evenOddNumber;
    }

    @Override
    public void run() {
        int number= evenOddNumber==true ? 2:1;

        while (number<=max){
          if(evenOddNumber){
              myPrinter.printEvenNumber(number);
          }else {
              myPrinter.printOddNumber(number);
          }
          number=number+2;
        }
    }
}


