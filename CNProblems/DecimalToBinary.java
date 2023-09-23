import java.util.Scanner;
public class DecimalToBinary {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        long pv=1;        //because int cannot store such large values like 1000000000000000100100
        long ans=0;
        while(n>0){
             ans=(ans+((n%2)*pv));
            pv=pv*10;
            n=n/2;
        }
        System.out.println(ans);
    }
}
