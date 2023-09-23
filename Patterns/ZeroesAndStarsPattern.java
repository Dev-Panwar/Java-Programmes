// *000*000*
// 0*00*00*0
// 00*0*0*00
// 000***000
import java.util.Scanner;

public class ZeroesAndStarsPattern {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int i=1;
        while(i<=n){
            int j=1;
            while(j<=(2*n)+1){
                if(  j==(((2*n)+1)/2)+1  || j==i || j==((2*n)+2-i)){
                    System.out.print("*");
                    j++;
                    double d=Math.round(((2*n)+1)/2);
                    int a=(int)d;
                    if(j==a+1){
                        System.out.print("*");
                        j++;
                    }
                }
                else{
                System.out.print("0");
                j++;
                }
            }
            System.out.println();
            i++;

        }
    }
}
