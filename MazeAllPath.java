package Recursion;

public class MazeAllPath {
    public static void main(String[] args) {
        boolean[][] game={{true,true,true},{true,true,true},{true,true,true}};
        allPath("",game,0,0);
    }
    public static void allPath(String sub,boolean[][] maze,int rows,int cols){
        if(rows==maze.length-1 && cols==maze[0].length-1){
            System.out.println(sub);
            return;
        }
        if(!maze[rows][cols]){
            return;
        }
        maze[rows][cols]=false;
        if(rows<maze.length-1){
            allPath("D"+sub,maze,rows+1,cols);
        }
        if(cols<maze[0].length-1){
            allPath("R"+sub,maze,rows,cols+1);
        }
        if(rows>0){
             allPath("U"+sub,maze,rows-1,cols);
        }
        if(cols>0){
            allPath("L"+sub,maze,rows,cols-1);
        }
        maze[rows][cols]=true;
    }
}
