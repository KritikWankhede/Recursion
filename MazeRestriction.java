package Recursion;

import java.nio.file.Path;
import java.util.ArrayList;

public class MazeRestriction {
    public static void main(String[] args) {
            boolean[][] maze={ {true,true,true},{true,false,true},{true,true,true} };
        path("",maze,0,0);
        System.out.println(pathRet("",maze,0,0));
    }
    static void path(String sub,boolean[][] maze,int rows,int cols){
        if(rows==maze.length-1 && cols==maze[0].length-1){
            System.out.println(sub);
            return;
        }
        if(!maze[rows][cols]){
            return;
        }
        if(rows<maze.length-1){
            path("D"+sub,maze,rows+1,cols);
        }
        if(cols<maze[0].length-1){
            path("R"+sub,maze,rows,cols+1);
        }

    }

    static ArrayList<String> pathRet(String sub,boolean[][] maze,int rows,int cols){
        if(rows==maze.length-1 && cols==maze[0].length-1){
            ArrayList<String> list=new ArrayList<>();
            list.add(sub);
            return list;
        }
        ArrayList<String> ans=new ArrayList<>();
        if(!maze[rows][cols]){
            return pathRet("",maze,rows+1,cols+1);
        }
        if(rows<maze.length-1){
            ans.addAll( pathRet("D"+sub,maze,rows+1,cols));
        }
        if(cols<maze[0].length-1){
            ans.addAll(pathRet("R"+sub,maze,rows,cols+1));
        }
        return ans;
    }
}
