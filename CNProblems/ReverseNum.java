// Write a program to generate the reverse of a given number N. Print the corresponding reverse number.
// Note : If a number has trailing zeros, then its reverse will not include them. For e.g., reverse of 10400 will be 401 instead of 00401.

import java.util.Scanner;
public class ReverseNum {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int rev=0;
        while(n>0){
            rev=(rev*10)+n%10;
            n=n/10;
        }
        System.out.println(rev);
    }
}
