// 1357 Hard
// 3571
// 5713
// 7135
import java.util.Scanner;

public class OddSquare {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int i=1;
        int MaxOdd=1+(n-1)*2;
        int OddCount=0;
        while(i<=n){
            int j=1;
            int odd=1;
            odd=odd+OddCount;
            while(j<=n){
                if(odd>MaxOdd){
                    odd=1;
                }
                System.out.print(odd);
                j++;
                odd=odd+2;
            }
            System.out.println();
            i++;
            OddCount=OddCount+2;
        }
        
    }
}
