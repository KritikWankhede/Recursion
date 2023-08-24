package Recursion;

import java.util.ArrayList;

public class MazePath {
    public static void main(String[] args) {
        System.out.println(path("",3,3));
        System.out.println(pathDiagonal("",3,3));
    }
    static ArrayList<String> path(String sub,int rows,int cols){
        if(rows==1 && cols==1){
            ArrayList<String> list=new ArrayList<>();
            list.add(sub);
            return list;
        }
        ArrayList<String> ans=new ArrayList<>();
        if(rows>1) {
            ans.addAll(path("D"+sub,rows-1,cols));
        }
        if(cols>1) {
            ans.addAll(path("R"+sub,rows,cols-1));
        }
        return ans;
    }

    static ArrayList<String> pathDiagonal(String sub,int rows,int cols){
        if(rows==1 && cols==1){
            ArrayList<String> list=new ArrayList<>();
            list.add(sub);
            return list;
        }
        ArrayList<String> ans=new ArrayList<>();
        if(rows>1 && cols>1){
            ans.addAll(pathDiagonal("D"+sub,rows-1,cols-1));
        }
        if(rows>1) {
            ans.addAll(pathDiagonal("V"+sub,rows-1,cols));
        }
        if(cols>1) {
            ans.addAll(pathDiagonal("H"+sub,rows,cols-1));
        }
        return ans;
    }
}
