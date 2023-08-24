package Recursion;

public class FibonnaciRecursion {
    public static void main(String[] args) {
        System.out.println(fibo(4));
        System.out.println(tribonacci(4));
    }
    /*
    recurrence relation:-fibonnaci of num:-fibo(num-1)+fibo(num-2)
      f(num)    f(4)
             /         \
  f(num-1) f(3)   +    f(2)  f(num-2)
           /    \        /  \
          f(2) + f(1)  f(1) + f(0)
          /   \
         f(1)+f(0)
     */
    static int fibo(int num){
        if(num<2){
            return num;
        }
        return (fibo(num-1)+fibo(num-2));
    }
    static int tribonacci(int n) {
        if(n==0){
            return 0;
        }
        if(n==1||n==2){
            return 1;
        }
        return tribonacci(n-1)+tribonacci(n-2)+tribonacci(n-3);
    }
}
