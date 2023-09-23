import java.util.Scanner;
public class SumOfBoundariesAndDiagonals {
    public static void totalSum(int[][] mat) {
        int rows=mat.length;
        int cols=mat[0].length;
       int boundary=Integer.MIN_VALUE;
       int Diagonal=Integer.MIN_VALUE;
       for(int i=0;i<rows;i++){
           for(int j=0;j<cols;j++){
             if(i==0||j==0||j==cols-1||i==rows-1){
                 boundary+=mat[i][j];
                 mat[i][j]=0;
             } 
             if(i==j||i==rows-1-j){
                 Diagonal+=mat[i][j];
             } 
           }
       }
       System.out.println(Diagonal+boundary);
    }
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("ENTER ROW NUMBER");
        int rows=s.nextInt();
        System.out.println("ENTER COLUMN NUMBER");
        int cols=s.nextInt();
        int input[][]=new int[rows][cols];
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.println("Enter number in "+i+" row "+j+" column ");
                input[i][j]=s.nextInt();
            }
        }
        totalSum(input);
    }
}
