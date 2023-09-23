import java.util.Scanner;

public class ReverseString {
    public static String reverseString(String str){
        String reversedString="";
        //for(int i=str.length()-1;i>=0;i--){
          // reversedString+=str.charAt(i);
      //  } OR
    //or
    for(int i=0;i<str.length();i++){
        // reversedString+=str.charAt(str.length()-1-i); or
        reversedString=str.charAt(i)+reversedString;  //best way
    }  
    
      return reversedString;
      }

    public static void main(String args[]) {
      Scanner s=new Scanner(System.in);
      String str=s.nextLine();
      String reversedString=reverseString(str);
      System.out.println(reversedString);
      
    }
}