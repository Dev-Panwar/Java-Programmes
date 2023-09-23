import java.util.Scanner;

public class PrintAllPrimeTillN {
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
        int i=2;
        while(i<=n){
        if(isPrime(i)==true){
            System.out.println(i);
        }
        i++;
        }
    }
}
