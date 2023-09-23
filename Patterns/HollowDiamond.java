import java.util.Scanner;

public class HollowDiamond {
    public static void PrintHollowDiamond(int n){
        for(int i=1;i<=n;i++){
            for(int spaces=i;spaces<n;spaces++){
                System.out.print(" ");
            }
            System.out.print("*");
            for(int spaces=1;spaces<2*(i-1);spaces++){
                System.out.print(" ");
            }
            if(i!=1){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=1;i<=n;i++){
            for(int spaces=1;spaces<i;spaces++){
              System.out.print(" ");
            }
            System.out.print("*");
            for(int spaces=1;spaces<2*(n-i);spaces++){
                System.out.print(" ");
            }
            if(i!=n){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        PrintHollowDiamond(n);

    }
}
