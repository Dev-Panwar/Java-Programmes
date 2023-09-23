//    1
//   121
//  12321
// 1234321
import java.util.Scanner;

public class IsocelesTriangPattern {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int i=1;
        while(i<=n){
         int spaces=1; //we can also take int j. these are columns where spaces
         while(spaces<=n-i){
             System.out.print(" ");
             spaces++;
         }
         int j=1;  // take j=1; if earlier wrote int j
         int p=1; // starting number till increasing
         while(j<=i){
             System.out.print(p);
             p++;
             j++;
         }
         j=1;
         p=i-1; // starting number for decreasing
         while(j<=i-1){
             System.out.print(p);
             p--;
             j++;
         }
         System.out.println();
         i++;
        }
    }
}