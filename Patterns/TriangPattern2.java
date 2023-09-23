// 1
// 23
// 456
// 78910
import java.util.Scanner;

public class TriangPattern2 {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int i=1;                        
        int t=1;  //t is starting no. and here we want to initialize only once. because see pattern starting number is continuos
        while(i<=n){          // t does not equal to i at starting of any row
            int j=1;
        
            while(j<=i){
                System.out.print(t);
                t++;
                j++;
            }
            System.out.println();
            i++;
        }
    }
}