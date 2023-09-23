import java.util.Scanner;

public class TotalSalary {
   public static void main(String[] args){
Scanner s=new Scanner(System.in);
int bs=s.nextInt(); //bs=basic salary
char g=s.next().charAt(0); //g=grade
  //totalSalary = basic + hra + da + allow – pf
  //hra   = 20% of basic
   //da    = 50% of basic
 //allow = 1700 if grade = ‘A’ 
  //allow = 1500 if grade = ‘B’
   //allow = 1300 if grade = ‘C' or any other character
   //pf    = 11% of basic.                                            
int allow;
if (g=='A'){
   allow=1700;
}
else if (g=='B'){
   allow=1500;
}
 else {
   allow=1300;
 }
   
double ts=(bs+(0.20*bs)+(0.5*bs)+allow-(0.11*bs));
double p=Math.round(ts);
int TS=(int)p;
System.out.println(TS);

 }
}