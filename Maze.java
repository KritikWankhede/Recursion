package Recursion;

public class Maze {
    public static void main(String[] args) {
        System.out.println(count(3,3));
    }
    static int count(int rows,int cols){
        if(rows==1||cols==1){
            return 1;
        }
        int left=count(rows-1,cols);
        int right=count(rows,cols-1);
        return left+right;
    }
}
