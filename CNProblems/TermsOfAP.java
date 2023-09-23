// Write a program to print first x terms of the series 3N + 2 which are not multiples of 4.
import java.util.Scanner;

public class TermsOfAP {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int x=s.nextInt();
        int n=1;
        int count=1;
        while(count<=x){
         int nextTerm=(3*n)+2;
         n++;
         if(!(nextTerm%4==0)){
           System.out.print(nextTerm+" ");
           count++;
         }
        }
    }
}
