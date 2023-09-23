import java.util.Scanner;

public class IsocelesTriangPattern1 {
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
         while(j<=i){
             System.out.print("*");
             j++;
         }
         j=1;
         while(j<=i-1){
             System.out.print("*");   // or here we can mix above loop by writing while(j<=2*i-1) just added.
             j++;
         }
         System.out.println();
         i++;
        }
    }
}