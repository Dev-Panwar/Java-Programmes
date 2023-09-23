import java.util.Scanner;
public class HalfDiamond {

    public static void main(String[] args) {
     	Scanner sc= new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println("*");
		for(int i=1;i<=n;i++) {
			
				
				System.out.print("*");
				for(int j=1;j<=i;j++) {
				System.out.print(j);
				}
				
				int p=i-1;
		
				for(int j=1;j<i;j++) {
					if(p>0)
					System.out.print(p);
					p--;
				}
				
				System.out.print("*");

			

			System.out.println();
			
			
		}
		int n1=n-1;
		for(int i=n1;i>=1;i--) {
			
			
				System.out.print("*");	
				for(int j=1;j<=i;j++) {
					System.out.print(j);
				}
				int p=i-1;
				
				for(int j=1;j<i;j++) {
					if(p>0)
					System.out.print(p);
					p--;
				}
				System.out.print("*");
				
				
			System.out.println();
		}
		
 System.out.println("*");
    }
}