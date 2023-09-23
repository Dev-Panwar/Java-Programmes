// ABCD
// BCDE
// CDEF
// DEFG
import java.util.Scanner;

public class CharacterPattern1 {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int i=1;

        while(i<=n){
            int j=1;
            char t=(char)('A'+i-1);     //t=startingChar
            while(j<=n){
                System.out.print(t);
                t++;      // or t=((char)(t+1));
                j++;
            }
            System.out.println();
            i++;
        }
    }
}