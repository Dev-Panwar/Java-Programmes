//     1
//    12
//   123
//  1234  
import java.util.Scanner;

public class MirrorImagePattern2 {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int i=1;
        while(i<=n){
            int j=1;
            while (j<=n-i){
                System.out.print(" "); //first we print Spaces
                j++;
            }
            j=1;
            while(j<=i){
                System.out.print(j); //then output
                j++;
            }
            System.out.println();
            i++;
        }
}
}