package Recursion;

import java.util.Scanner;

public class PowerOf2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int power= sc.nextInt();
        System.out.println(power(num,power));
    }

    static boolean isPowerOf2(int num) {
        if (num % 2 != 0 && num != 1 || num == 0) {
            return false;
        }
        if (num == 1) {
            return true;
        }
        return isPowerOf2(num / 2);
    }

    static boolean power(int num, int power) {
        if(num==0) return false;
        while(num%power==0){
            num=num/power;
        }
        return (num==1);
    }



}
