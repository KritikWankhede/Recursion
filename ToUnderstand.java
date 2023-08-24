package Recursion;

import java.util.Scanner;

public class ToUnderstand {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        print(1,num);
    }
    //Every function call will have its separate memory in Stack
    //It needs a base class or it will have stack overflow error.
    static void print(int num,int end){
        if(num==end){
            System.out.print(num+" ");
            return;
        }
        System.out.print(num+" ");
        print(num+1,end);
    }

}
