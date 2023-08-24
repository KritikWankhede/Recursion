package Recursion;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        System.out.println(isPalindrome(num));
    }
    static boolean isPalindrome(int num){
        if(Math.log10(num)==0){
            return true;
        }
        return (num==rev(num));
    }
    static int rev(int num){
        int base=(int)Math.log10(num)+1;
        return helper(num,base);
    }
    static int helper(int num,int base){
        if(num%10==num){
            return num;
        }
        int rem=num%10;
        return rem*(int)Math.pow(10,base-1)+helper(num/10,base-1);
    }

}
