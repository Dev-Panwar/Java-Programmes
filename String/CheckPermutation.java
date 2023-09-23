public class CheckPermutation {
    public static boolean isPermutation(String str1, String str2) {
        int freq1[]=new int[256];
        int freq2[]=new int[256];
        for(int i=0;i<str1.length();i++){
            freq1[str1.charAt(i)]+=1;
        }
        for(int i=0;i<str2.length();i++){
           freq2[str2.charAt(i)]+=1;
       }
       for(int i=0;i<freq1.length;i++){
           if(freq1[i]!=freq2[i]){
               return false;
           }
       }
       return true;
       }
       public static void main(String[] args){
           String xyz="aba";
           String abc="aab";
           System.out.println(isPermutation(xyz, abc));
       }
   } 

