package Recursion;
import java.util.Scanner;
public class NumberOfParticularDigit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(count(sc.nextInt()));
    }
    static int count(int num){
       return helper(num,0);
    }
    static int helper(int num,int count){
        if(num%10==num){
            return count;
        }
        int rem=num%10;
        if(rem==0){
            return helper(num/10,count+1);
        }
       return helper(num/10,count);
    }

}
