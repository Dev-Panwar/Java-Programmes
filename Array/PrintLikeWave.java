import java.util.Scanner;
public class PrintLikeWave {
    public static void wavePrint(int mat[][]){
        if(mat.length==0){
            return;
        }
	int rows=mat.length;
    int cols=mat[0].length;
    for(int j=0;j<rows;j++){
        if(j%2==0||j==0){
            for(int i=0;i<rows;i++){
                   System.out.print(mat[i][j]+" ");
            }
               }
               if(j%2!=0){
                   for(int i=rows-1;i>=0;i--){
                   System.out.print(mat[i][j]+" ");
                   }
               }
           }
       
           System.out.println();
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
            wavePrint(input);
        }
}
