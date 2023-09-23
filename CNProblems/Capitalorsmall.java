import java.util.Scanner;

public class Capitalorsmall {
   public static void main(String[] args){
       Scanner s= new Scanner(System.in);
       char n=s.next().charAt(0);
       int i=n;
       if (i>=65 && i<=90){
           System.out.println("Capital");
       } else if (i>=97 && i<=122){
           System.out.println("Small");
       } else {
    System.out.println("not an alphabet");
       }
   } 
        
    
}