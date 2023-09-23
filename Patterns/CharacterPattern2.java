// E
// DE
// CDE
// BCDE
// ABCDE
import java.util.Scanner;

public class CharacterPattern2 {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int i=1;

        while(i<=n){
            int j=1;
            char t=(char)('A'+n-i);     //t=startingChar
            while(j<=i){
                System.out.print(t);
                t++;     // or t=((char)(t+1));
                j++;
            }
            System.out.println();
            i++;
        }
    }
}