package com.example.manoj.mysamples;


import rx.Observable;
import rx.Observer;
import rx.Subscriber;

/**
 * Created by Manoj on 5/15/2018.
 */

public class MyRxJavaClass {
    public static void main(String [] args){
        Observable<String> createObserver = Observable.create(new Observable.OnSubscribe<String>() {
            @Override
            public void call(Subscriber<? super String> subscriber) {
                subscriber.onNext("Hello World");
                subscriber.onCompleted();
            }
        });

        Subscriber<String> mySubscriber = new Subscriber<String>() {
            @Override
            public void onNext(String s) {
                System.out.println("MySubscriber onNext(): "+ s);
            }

            @Override
            public void onCompleted() {
                System.out.println("Subscriber completed");
            }

            @Override
            public void onError(Throwable e) {
                System.out.println("OnError");
            }
        };

        Observer<String> myObserver = new Observer<String>() {
            @Override
            public void onNext(String s) {
                System.out.println("MyObserver onNext(): "+ s);
            }

            @Override
            public void onCompleted() {
                System.out.println("Observer completed");
            }

            @Override
            public void onError(Throwable e) {
            }
        };

        createObserver.subscribe(mySubscriber);
        createObserver.subscribe(myObserver);


    }
}
