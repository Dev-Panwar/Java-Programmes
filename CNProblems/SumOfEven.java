import java.util.Scanner;

public class SumOfEven {
    public static void main(String[] args){
        Scanner s= new Scanner(System.in);
        int N=s.nextInt();
        int I=2; //smallest even
        int Sum=0;
        while (I<=N){
            Sum=Sum+I;
            I=I+2;
        }
        System.out.println(Sum);
        
    }
}
