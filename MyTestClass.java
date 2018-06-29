package com.example.manoj.mysamples;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by Manoj on 5/3/2018.
 */

public class MyTestClass {

    public void display(int a) {
     System.out.println("Data type..........");
    }

    public void display(Integer a) {
        System.out.println("Object..........");
    }


    protected int fibonokiseries(int a, int b) {
        int num;

        num = a + b;
        System.out.println(num);
        a = b;
        b = num;
        if (b > 33) {
            return num;
        }
        num = fibonokiseries(a, b);

        return num;
    }

    public int factorial(int num) {
        int number = 1;
        if (num == 1) {
            return 1;
        }

        number = num * factorial(num - 1);

        return number;
    }

    public int fact(int num) {
        int number = 1;

        while (num > 1) {
            number = number * num;
            num--;
        }

        return number;
    }

    public int secondHingerNumber(int[] arr) {
        int a = 0;
        int b = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] > arr[i]) {
                if (a < arr[i - 1]) {
                    b = a;
                    a = arr[i - 1];
                } else if (b < arr[i]) {
                    b = arr[i];
                }
            } else {
                if (a < arr[i]) {
                    b = a;
                    a = arr[i];
                } else if (b < arr[i]) {
                    b = arr[i];
                }
            }
        }

        return b;
    }


}

class WorkerThread implements Runnable {

    private String command;

    public WorkerThread(String s) {
        this.command = s;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " Start. Command = " + command);
        processCommand();
        System.out.println(Thread.currentThread().getName() + " End.");
    }

    private void processCommand() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {
        return this.command;
    }
}

class MyTestDemo {
    public static void main(String args[]) {
       /* MyTestClass testClass = new MyTestClass();
        testClass.fibonokiseries(0, 1);
        System.out.println(testClass.factorial(5));
        System.out.println(testClass.fact(6));
        int arr[]={4,2,1,5,61,9,8,20,16,15};
        System.out.println(testClass.secondHingerNumber(arr));*/

        MyTestClass testClass = new MyTestClass();
        testClass.display(new Integer(10));

        ExecutorService executor = Executors.newFixedThreadPool(5);
        for (int i = 0; i < 10; i++) {
            Runnable worker = new WorkerThread("" + i);
            executor.execute(worker);
        }
        executor.shutdown();
        while (!executor.isTerminated()) {
        }
        System.out.println("Finished all threads");
    }
}


class LinkedList {
    Node head;

    static class Node {
        Node next;
        int data;

        Node(int _data) {
            this.data = _data;
            this.next = null;
        }

    }

    private void printData() {
        Node n = head;

        while (n != null) {
            System.out.println(n.data);
            n = n.next;
        }

    }

    private void deleteNode(int node) {
        Node node1 = new Node(1);
        //  node1.next=
    }


    public static void main(String args[]) {
        LinkedList linklist = new LinkedList();

        linklist.head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node four = new Node(4);

        linklist.head.next = second;
        second.next = third;
        third.next = four;

        linklist.printData();

        linklist.deleteNode(3);

    }


}

