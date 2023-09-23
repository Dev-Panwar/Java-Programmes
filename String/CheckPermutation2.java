public class CheckPermutation2{
   
    public static int[] fillfrequency(String input,int add, int []array ){
        for(int i=0;i<input.length();i++){
            array[input.charAt(i)]=array[input.charAt(i)]+add;
        }
        return array;
    }

    public static boolean IsEqual(int[] arr1,String input){
        for(int i=0;i<input.length();i++){
            if(arr1[input.charAt(i)]!=0){
                return false;
            }
        }
        return true;
    }

    public static boolean CheckPermutation(String str1,String str2){
        if(str1.length()!=str2.length()){
            return false;
        }
      int freq[]=new int[256];
      freq=fillfrequency(str1, 1, freq);
      freq=fillfrequency(str2,-1, freq);

      boolean ans=IsEqual(freq,str1 );
      return ans;

    }
    public static void main(String[] args){
        String xyz="aba";
        String abc="aab";
        System.out.println(CheckPermutation(xyz, abc));
    }

}