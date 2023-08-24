package Recursion;

public class PrimeNumber {
    public static void main(String[] args) {
        System.out.println(countPrimes(10));
    }
    static public int countPrimes(int n) {
        int count=0;
        boolean flag=true;
        if(n<2){
            return 0;
        }
        for(int i=2;i*i<=n;i++){
            if(n%i==0){
                flag=false;
                break;
            }
        }
        if(flag){
            count++;
        }
        return count+countPrimes(n-1);
    }
}
