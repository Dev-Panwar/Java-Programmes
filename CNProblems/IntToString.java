import java.util.Scanner;

public class IntToString {
    public static void main(String[] args){
        Scanner s= new Scanner(System.in);
        int i=s.nextInt();
        if (i==1){
            System.out.println("One");
        }
        if (i==2){
            System.out.println("Two");
        }
        if (i==3){
            System.out.println("Three");
        }
    }
}