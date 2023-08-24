package Recursion;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr={2,0,1,4,5};
       // bubbleSort(arr,0);
        bubble(arr,arr.length-1,0);
        System.out.println(Arrays.toString(arr));

    }

    static void bubble(int[] arr,int start,int end){
        if(start==0){
            return ;
        }
        if(end<start) {
            if (arr[end] > arr[end + 1]) {
                //Swap
                int temp = arr[end + 1];
                arr[end + 1] = arr[end];
                arr[end] = temp;
            }
            bubble(arr, start, end + 1);
        }
        else{
            bubble(arr,start-1,end);
        }
    }
    /*
     static void bubbleSort(int[] arr,int num) {
        if (num == arr.length) {
            return;
        }
        boolean flag = false;
        for (int i = 1; i < arr.length - num; i++) {
            if (arr[i] < arr[i - 1]) {
                int temp = arr[i];
                arr[i]=arr[i-1];
                arr[i-1]=temp;
                flag=true;
            }
        }
        if(!flag){
            return;
        }
        bubbleSort(arr,num+1);
    }
     */
}
