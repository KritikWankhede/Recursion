package Recursion;

import java.util.ArrayList;

public class LinearSearch {
    public static void main(String[] args) {
       int[] num={1,5,0,4,0,2};
        search(num, num.length-1, 0);
        System.out.println(list);
        ArrayList<Integer> item=new ArrayList<>();
        System.out.println(newSearch(num, num.length-1,0,item));
        System.out.println(find(num, num.length -1,0));
    }
    static ArrayList<Integer> list=new ArrayList<>();
    static int search(int[] num,int index,int target){
        if(index<0){
            return -1;
        }
        if(num[index]==target){
            list.add(index);
        }
        return search(num,index-1,target);
    }
    static ArrayList<Integer> newSearch(int[] num,int index,int target,ArrayList<Integer> item){
        if(index<0){
            return item;
        }
        if(num[index]==target){
            item.add(index);
        }
        return newSearch(num,index-1,target,item);
    }
    static ArrayList<Integer> find(int[] num,int index,int target){
        ArrayList<Integer> list=new ArrayList<>();
        if(index<0){
            return list;
        }
        if(num[index]==target){
            list.add(index);
        }
        ArrayList<Integer> newItem=find(num,index-1,0);
        list.addAll(newItem);
        return list;
    }
}
