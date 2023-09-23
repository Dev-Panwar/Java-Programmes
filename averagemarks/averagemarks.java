import java.util.Scanner;

public class averagemarks {
    public static void main(String[] args){
        Scanner scan= new Scanner(System.in);
        String str=scan.next();
        int m1=scan.nextInt();
        int m2=scan.nextInt();
        int m3=scan.nextInt();
    
        char c=str.charAt(0);
        int av=(m1+m2+m3)/3;
        System.out.println(c);
        System.out.println(av);

        
        
    }
}
