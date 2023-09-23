public class MinLengthWord {
    public static String minLengthWord(String input){
        int length=input.length();
        int si=0,ei=0;
        int min_length=length,min_StartIndex=0;
        String ans="";
        while(ei<=length){
       if(ei<length&& input.charAt(ei)!=' '){
           ei++;
       }
       else{
           int curr_len=ei-si;
           if(curr_len<min_length){
               min_length=curr_len;
               min_StartIndex=si;
           }
           ei++;
           si=ei;
       }
 
        }
        for(int i=0;i<min_length;i++){
            ans+=input.charAt(min_StartIndex++);
        }
        return ans;
 
     }
  
 
 
     public static void main(String[] args){
         String str="this is test string";
         String ans=minLengthWord(str);
         System.out.println(ans);
     }
}
