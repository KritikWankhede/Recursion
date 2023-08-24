package Recursion;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int ans=sum(num,0);
        System.out.println(sumofDigits(num));

        System.out.println(ans);
    }
    static int sum(int num,int sum){

        int rem=num%10;
        sum=sum+rem;
        if(num==0){
            return sum;
        }
        return sum(num/10,sum);
    }
    static int sumofDigits(int num){
        if(num==0){
            return 0;
        }
        return sumofDigits(num/10)+num%10;
    }
}
