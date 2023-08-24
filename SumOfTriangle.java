package Recursion;

import java.util.Arrays;

public class SumOfTriangle {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
        sumOfTriangle(arr);
    }
    private static void sumOfTriangle(int[] arr) {
        if(arr.length<2){
            return;
        }
        int[] temp=new int[arr.length-1];
        for (int i = 0; i < temp.length; i++) {
            temp[i]=arr[i]+arr[i+1];
        }

        sumOfTriangle(temp);
        System.out.println(Arrays.toString(temp));
    }
}

