// Write a program that asks the user for a number N and a choice C. And then give them the possibility to choose between computing
//  the sum and computing the product of all integers in the range 1 to N (both inclusive).
// If C is equal to -
//  1, then print the sum
//  2, then print the product
//  Any other number, then print '-1' (without the quotes)
import java.util.Scanner;

public class SumOrProduct {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("write Integer n:");
        int n=s.nextInt();
        System.out.println("Write Choice c");
        int c=s.nextInt();
        int sum=0;
        int Product=1;
        for(int i=1;i<=n;++i){
                sum=sum+i;
                Product=Product*i;
            }
            if(c==1){
                System.out.println(sum);
            }
            if(c==2){
                System.out.println(Product);
            }
            if(c==0 || c>2){
                System.out.println("-1");
            }

        }
    }

