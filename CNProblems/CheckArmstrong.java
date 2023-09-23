
import java.util.Scanner;

public class CheckArmstrong {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int save_n=n;
        int count=0;
        while(n>0){
            count++;
            n=n/10;
        }
       n=save_n;
       int sum=0;
       while(n > 0){
           int lastdigit=n%10;
           sum+=Math.pow(lastdigit, count);
           n=n/10;
       }
       n=save_n;
       if(sum==n){
           System.out.println("true");
       }
       else{
           System.out.println("false");
       }
    }
    
    }
    

