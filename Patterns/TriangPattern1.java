// 1
// 23
// 345
// 4567
import java.util.Scanner;

public class TriangPattern1 {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int i=1;                        
                    
        while(i<=n){
            int j=1;
            int t=i;  //t is starting no. here we initialize it everytime when jumping to next row
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