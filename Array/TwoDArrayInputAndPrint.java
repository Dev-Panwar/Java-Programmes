

import java.util.Scanner;

public class TwoDArrayInputAndPrint {
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
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.print(input[i][j]+" ");
                
            }
            System.out.println();
        }
    }
}
