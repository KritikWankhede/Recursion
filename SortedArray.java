package Recursion;

public class SortedArray {
    public static void main(String[] args) {
        int[] nums={10,20,30,40,50};
        System.out.println(sorted(nums,0));
        System.out.println(arraySortedOrNot(nums,nums.length));
    }
    static boolean sorted(int[] nums,int index){
        if(index==nums.length-1) return true;
        return nums[index]<=nums[index+1] && sorted(nums,index+1);
    }
     static boolean arraySortedOrNot(int[] arr, int n) {
        // code here
        if (n < 2) {
            return true;
        }
        return (arr[n - 2] <= arr[n - 1] && arraySortedOrNot(arr, n - 1));
    }
}
