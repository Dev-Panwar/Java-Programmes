import java.util.Scanner;

public class FindPowerofNum {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        /*
        Write a program to find x to the power n (i.e. x^n). Take x and n from the user. You need to print the answer.
        */
        
        int n=s.nextInt();
        int x=s.nextInt();
        int p=1;
          for(int i=1;i<=x;i++)
          {
               p=p*n;
          }
          System.out.println(p);
    }
}
