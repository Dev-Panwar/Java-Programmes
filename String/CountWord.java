import java.util.Scanner;

public class CountWord {
    public static int countWords(String str) {	
        int count=1;
   for(int i=0;i<str.length();i++){
       if(str.charAt(i)==' '){
           count++;
       }
   }
   if(str.length()==0){
       count=0;
   }
   return count;
   }
   public static void main(String[]args){
       Scanner s=new Scanner(System.in);
       String str=s.nextLine();
       int ans=countWords(str);
       System.out.println(ans);
   }
}
