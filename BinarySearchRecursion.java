package Recursion;

public class BinarySearchRecursion {
    public static void main(String[] args) {
        int[] arr={1,32,43,45,50,69,70};
        int target=69;
        System.out.println(binarySearch(arr,target,0,arr.length-1));

    }
    static int binarySearch(int[] arr,int target,int start,int end){
        int mid=start+(end-start)/2;
        if(end<start){
            return -1;
        }
        if(arr[mid]==target){
            return mid;
        }
        if(arr[mid]<target){
            return binarySearch(arr,target,mid+1,end);
        }
        return binarySearch(arr, target, start, mid-1);
    }
}
