public class XraisePowern {
    public static int XraisePower_n(int base,int exponent){
        int ans=1;
       while(exponent!=0){
          ans*=base;
          exponent--;
       }
       return ans;
    }
    public static void main(String[] args){
     System.out.println(XraisePower_n(2, 4));
    }
}
