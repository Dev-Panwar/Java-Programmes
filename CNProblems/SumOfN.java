import java.util.Scanner;

public class SumOfN {
    public static void main(String[] args){
        Scanner s= new Scanner(System.in);
        int N= s.nextInt();
        int Sum=0;
        int I=1; // next number to be added
        
        while (I<=N) {
            Sum=Sum+I;
            I=I+1;
            
        }
        System.out.println(Sum);

    }
}
