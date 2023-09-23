public class RemoveOccurence {
    public static String removeAllOccurrencesOfChar(String str, char ch) {
		String ans="";
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)!=ch){
                ans+=str.charAt(i);
            }
        }
        return ans;
	}
    public static void main(String[] args){
        String str="aaaabbbccd";
        char ch='a';
        System.out.println(removeAllOccurrencesOfChar(str, ch));
    }


}
