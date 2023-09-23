// 1
// 12
// 123
// 1234
import java.util.Scanner;

public class TriangPattern {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int i=1;                        
                    
        while(i<=n){
            int j=1;
            int t=1;  //t is starting no.
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
// other way
// int n=s.nextInt();
// int i=1;   
// while(i<=n){
//     int j=1;   
//     while(j<=i){
//         System.out.print(j); see pattern always column no. print
//        j++;
//     }
//     System.out.println();
//     i++;
// 