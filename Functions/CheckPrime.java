import java.util.Scanner;

public class CheckPrime {
    public static boolean isPrime(int n){
        if(n==1 || n==0){
            return false;
        }
        int d=2;
        while (d<n){
            if(n%d==0){
                return false;
            }
            d++;
            
        }
        return true;
    }
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        boolean prime=isPrime(n);
        System.out.println(prime);
    }
}
