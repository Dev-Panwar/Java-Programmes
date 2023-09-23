import java.util.Scanner;
public class LargestRowOrColumn {
    public static void findLargest(int mat[][]){
        if(mat.length==0){
            System.out.println("row "+"0"+Integer.MIN_VALUE);
            return;
        }
       int largestSumRow=0;
       int largestSumCol=0;
       int LrowSum=Integer.MIN_VALUE;
       int LColSum=Integer.MIN_VALUE;
      for(int i=0;i<mat.length;i++){
          int sum=0;
          for(int j=0;j<mat[i].length;j++){
                  sum+=mat[i][j];
          }
          if(sum>LrowSum){
              LrowSum=sum;
              largestSumRow=i;
          }
      }
      for(int j=0;j<mat[0].length;j++){ //acc to ques. number of columns in each row is equal.
        int sum=0;
        for(int i=0;i<mat.length;i++){
                sum+=mat[i][j];
        }
        if(sum>LColSum){
            LColSum=sum;
            largestSumCol=j;
        }
    }
   
    if(LrowSum>=LColSum){
        System.out.println("row "+largestSumRow+" "+LrowSum);
    }
    else{
        System.out.println("column "+largestSumCol+" "+LColSum);
    }

    }
    public static int[][] TakeInput(){
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER ROW NUMBER");
        int rows=sc.nextInt();
        System.out.println("ENTER COLUMN NUMBER");
        int cols=sc.nextInt();
        int input[][]=new int[rows][cols];
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.println("Enter number in "+i+" row "+j+" column ");
                input[i][j]=sc.nextInt();
            }
        }
        
        return input;
    }
    public static void main(String[] args){
         int input[][]=TakeInput();
        findLargest(input);
    }
}
