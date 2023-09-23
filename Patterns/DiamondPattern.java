//    *
//   ***
//  *****
// *******
//  *****
//   ***
//    *
import java.util.Scanner;

public class DiamondPattern {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int i=1;
        int n1=(n+1)/2;
        int n2=(n-1)/2;
        while(i<=n1){
         int spaces=1; //we can also take int j. these are columns where spaces
         while(spaces<=n1-i){
             System.out.print(" ");
             spaces++;
         }
         int j=1;  // take j=1; if earlier wrote int j 
         while(j<=2*i-1){
             System.out.print("*");       
             j++;
         }
        

         System.out.println();
         i++;
        }
        // 2nd half
        int i1=n2;
        while (i<=n){
            
            int spaces=1;
             while(spaces<=n2-i1+1){
                System.out.print(" ");
                spaces=spaces+1;
            }
            int j=1;
            while (j<=2*i1-1){
                System.out.print("*");
                j++;
            }
            System.out.println();
            i1--;
            i++;

        }
        
        

    }
}