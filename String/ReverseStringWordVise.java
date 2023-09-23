public class ReverseStringWordVise {
    public static String reverseWordWise(String str) {
        String ans="";
        int currentWordStart=0;
        int i=0;
        for(;i<str.length();i++){
            if(str.charAt(i)==' '){
                //Reverse Current Word
                int currentWordEnd=i-1;
                String reversedWord="";
                for(int j=currentWordStart;j<=currentWordEnd;j++){
                    reversedWord=str.charAt(j)+reversedWord;
                }
                //Add it final String(ans)
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
        //return ans;
               
        String ans1="";
        for(int j=0;j<ans.length();j++){
            ans1+=ans.charAt(ans.length()-1-j);
        }
        return ans1;
        
        
    }
    public static void main(String[] args){
        String xyz="Coding Ninjas";
        System.out.println(reverseWordWise(xyz));
    }
}
