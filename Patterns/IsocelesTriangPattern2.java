import java.util.Scanner;

public class IsocelesTriangPattern2 {
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
         int j=1;
         int p=i;
         while(j<=i){
             System.out.print(p);
             p++;
             j++;
             }
             j=1;
             p=(2*i-2);
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