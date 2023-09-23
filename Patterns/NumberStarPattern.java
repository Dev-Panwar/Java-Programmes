// 5432*
// 543*1
// 54*21
// 5*321
// *4321
import java.util.Scanner;
public class NumberStarPattern {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int i=1;
        while(i<=n){
            int j=1;
            int t=n; //Starting Num
            while(j<=n){
                if(j==n-i+1){
                    System.out.print("*");
                    j++;
                    t--;
                }
                else{
                System.out.print(t);
                t--;
                j++;
                }
            }
            System.out.println();
            i++;

        }
    }
}
