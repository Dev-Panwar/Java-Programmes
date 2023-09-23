public class RemoveConsecutiveDuplicates {
    public static String removeConsecutiveDuplicates(String str) {
       if(str==null){
           return null;
       }
       int start=0;
       int end=0;
       String withoutduplicates="";
       while(start<str.length()){
           while((end<str.length())&&(str.charAt(start)==str.charAt(end))){
               end+=1;
           }
            withoutduplicates+=str.charAt(start);
            start=end;
       }
       return withoutduplicates;
    }
    public static void main(String[] args){
        String xyz="aaaabbbbbbcccc";
        System.out.println(removeConsecutiveDuplicates(xyz));
    }
}
