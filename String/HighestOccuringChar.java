public class HighestOccuringChar {
    public static char highestOccuringChar(String str) {
      int freq[]=new int[256];
     
      for(int i=0;i<str.length();i++){
          freq[str.charAt(i)]+=1;
      }
      int maxcount=freq[str.charAt(0)];
      char ans=str.charAt(0);
      for(int i=1;i<str.length();i++){
        if(freq[str.charAt(i)]>maxcount){
            maxcount=freq[str.charAt(i)];
            ans=str.charAt(i);
        }
      }
      return ans;
    }
    public static void main(String[] args){
  String xyz="aaaabbbcdaabbbddcccc";
  System.out.println(highestOccuringChar(xyz));
    }
    
}
