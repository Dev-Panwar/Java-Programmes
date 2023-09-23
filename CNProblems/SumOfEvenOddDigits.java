import java.util.Scanner;

public class SumOfEvenOddDigits {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        /* Write a program to input an integer N and print the sum of all its even digits and sum of all its odd digits separately.
Digits mean numbers, not the places! That is, if the given integer is "13245", even digits are 2 & 4 and odd digits are 1, 3 & 5.
Input format :
Output format :
Sum_of_Even_Digits Sum_of_Odd_Digits
(Print first even sum and then odd sum separated by space)
Constraints
0 <= N <= 10^8
Sample Input 1:
1234
Sample Output 1:
6 4 */

int soe=0;
int soo=0;
while (n!=0){
    int temp=n%10;
    if (temp%2==0){
        soe=soe+temp;
    }
    else {
        soo=soo+temp;
    }
    n=(int)(n/10);

}
System.out.println(soe+ " " +soo);

    }
}
