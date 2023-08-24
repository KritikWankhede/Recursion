package Recursion;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] num={1,0,4,8,5,3};
        selectionSort(num,num.length,0,0);
        System.out.println(Arrays.toString(num));
    }
    static void selectionSort(int[] arr,int start,int end,int max){
        if(start==0){
            return ;
        }
        if(end<start){
            if(arr[end]>arr[max]){
                selectionSort(arr,start,end+1,end);
            }
            else{
                selectionSort(arr,start,end+1,max);
            }
        }
        else{
            int temp=arr[start-1];
            arr[start-1]=arr[max];
            arr[max]=temp;
            selectionSort(arr,start-1,0,0);
        }
    }
}
