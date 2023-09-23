import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int r=s.nextInt();
        System.out.println("Perimeter = "+(2*3.14*r));
        System.out.println("Area ="+(3.14*r*r));
        s.close();

    }
}
