package Recursion;

public class RotatedBinaryArray {
    public static void main(String[] args) {
        int[] num={2,3,4,6,9,1,5,8};
        System.out.println(search(num,4,0,num.length-1));
    }
    static int search(int[] num,int target,int start,int end){
        if(start>end) return -1;
        int mid=start+(end-start)/2;
        if (num[mid]==target) {
            return mid;
        }
        if (num[start]<=num[mid]) {
            if (num[start] <= target && num[mid] >= target) {
                return search(num, target, start, mid - 1);
            } else {
                return search(num, target, mid + 1, end);
            }
        }
            if (num[mid] <= target && target <= num[end]) {
                return search(num,target,mid+1,end);
            }
        return search(num,target,start,mid-1);
    }
}
