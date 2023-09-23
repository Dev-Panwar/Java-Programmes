import java.util.Scanner;

public class CheckPalindrome {
    public static boolean isPalindrome(String str) {
        String str1="";
        for(int i=0;i<str.length();i++){
            str1+=str.charAt(str.length()-1-i);
          }
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)!=str1.charAt(i)){
                return false;
            }
        }
            return true;
        

        }
        public static void main(String[] args){
            Scanner s=new Scanner(System.in);
            String str=s.nextLine();
            boolean ans=isPalindrome(str);
            System.out.println(ans);
        }
          
 }
        
    

