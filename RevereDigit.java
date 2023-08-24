package Recursion;

import java.util.Scanner;

public class RevereDigit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        System.out.println(reverseNum(num));
    }
    static int reverseNum(int num){
       int noOfDigits=(int)Math.log10(num)+1;
       return helper(num,noOfDigits);
    }

     static int helper(int num, int base) {
        if(num%10==num){
            return num;
        }
        int rem=num%10;
        return rem*(int)(Math.pow(10,base-1))+helper(num/10,base-1);
    }
}
