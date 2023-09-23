// Given a binary number as an integer N, convert it into decimal and print.
import java.util.Scanner;
public class BinaryToDecimal {
    public static void main(String[] args){
       Scanner s=new Scanner(System.in);
       int n=s.nextInt();
       int pv=1;
       int ans=0;
       while(n>0){
           ans=ans+((n%10)*pv);
           pv=pv*2;
           n=n/10;   
       }
       System.out.println(ans);
    }
}
