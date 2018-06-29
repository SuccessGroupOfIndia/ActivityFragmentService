package com.example.manoj.mysamples;

/**
 * Created by Manoj on 6/14/2018.
 */
/*Find Second Highest Number*/
public class FindSecondHighestNumber {

    private int secondHigherNum(int []arr){
        int a=0,b=0;
        for(int i=1;i<arr.length;i++){
            if(arr[i-1]>arr[i]){
                if(a<arr[i-1]){
                   b=a;
                   a=arr[i-1];
                }else if(b<arr[i]){
                    b=arr[i];
                }
            }else {
                if(a<arr[i]){
                    b=a;
                    a=arr[i];
                }else if(b<arr[i]){
                    b=arr[i];
                }
            }

        }

        return b;
    }


    public static void main(String args[]){
        int arr[]={4,6,3,1,2,9,7,18,10,5};

        FindSecondHighestNumber secondHighestNumber=new FindSecondHighestNumber();
        int num=secondHighestNumber.secondHigherNum(arr);
        System.out.println(num);
    }
}
