package Recursion;

import java.util.Arrays;

public class AllPathStep {
    public static void main(String[] args) {
        boolean[][] game={{true,true,true},{true,true,true},{true,true,true}};
        int[][] arr=new int[game.length][game[0].length];
        allPathStep("",game,0,0,arr,1);
    }
    public static void allPathStep(String sub,boolean[][] maze,int rows,int cols,int[][] path,int step){
        if(rows==maze.length-1 && cols==maze[0].length-1){
            for(int[] arr:path){
                path[rows][cols]=step;
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(sub);
            return;
        }
        if(!maze[rows][cols]){
            return;
        }
        maze[rows][cols]=false;
        path[rows][cols]=step;
        if(rows<maze.length-1){
            allPathStep("D"+sub,maze,rows+1,cols,path,step+1);
        }
        if(cols<maze[0].length-1){
            allPathStep("R"+sub,maze,rows,cols+1,path,step+1);
        }
        if(rows>0){
            allPathStep("U"+sub,maze,rows-1,cols,path,step+1);
        }
        if(cols>0){
            allPathStep("L"+sub,maze,rows,cols-1,path,step+1);
        }
        maze[rows][cols]=true;
        path[rows][cols]=0;
    }
}
