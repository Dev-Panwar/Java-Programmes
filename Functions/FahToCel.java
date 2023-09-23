import java.util.Scanner;

// Given three values - Start Fahrenheit Value (S), End Fahrenheit value (E) and Step Size (W), you need to convert all 
// Fahrenheit values from Start to End at the gap of W, into their corresponding Celsius values and print the table.
// 3 integers - S, E and W respectively
// Output Format :
// Fahrenheit to Celsius conversion table. One line for every Fahrenheit and Celsius Fahrenheit value. Fahrenheit 
// value and its corresponding Celsius value should be separate by tab ("\t")
// Sample Input 1:
// 0 
// 100 
// 20
// Sample Output 1:
// 0   -17
// 20  -6
// 40  4
// 60  15
// 80  26
// 100 37
public class FahToCel {
    public static void fahtocel(int start,int end,int step){
        int s=start;
        int fah;
        while(s<=end){
            fah=(5*(s-32))/9;
           System.out.println(s+ " " +fah);
           s=s+step;
        }
        
    }
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int start=s.nextInt();
        int end=s.nextInt();
        int step=s.nextInt();
        fahtocel(start, end, step);
    }
    
}
