// check whether N is member of fibonacci or not
import java.util.Scanner;

public class CheckFibonacciNum {
    public static boolean FibonacciNum(int n){
        int a=0;
        int b=1;
        int c=0;
        while(c<n){
            c=a+b;
             a=b;
            b=c;
        }
        if(n==c){
            return true;
        }
        else{
            return false;
        }
        }
    
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        System.out.println(FibonacciNum(n));
    }
}
    

