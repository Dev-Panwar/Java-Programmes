public class ReverseEachWord {
    public static String ReverseWord(String str){
      int i=0;
      String ans="";
      int currentWordStart=0;
      for(;i<str.length();i++){
          if(str.charAt(i)==' '){
          int currentWordEnd=i-1;
          String reversedWord="";
          for(int j=currentWordStart;j<=currentWordEnd;j++){
              reversedWord=str.charAt(j)+reversedWord;
          }
          ans+=reversedWord+" ";
          currentWordStart=i+1;
          }

      }
      int currentWordEnd=i-1;
          String reversedWord="";
          for(int j=currentWordStart;j<=currentWordEnd;j++){
              reversedWord=str.charAt(j)+reversedWord;
          }
          ans+=reversedWord;
          return ans;
    }
    public static void main(String[] args){
        String input="abc def ghi";
        System.out.println(ReverseWord(input));

    }
}
