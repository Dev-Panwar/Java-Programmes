import java.util.Scanner;

public class ArrangeArrayNumbers {
    public static void arrange(int[] arr,int n){
        for(int val=1,s=0,e=n-1; val<=n;){
            arr[s]=val;
            if(val==n){
                break;
            }
            s++;
            val++;    
            arr[e]=val;
            val++;
            e--;
        }
           for(int j=0;j<n;j++){
            System.out.print(arr[j]+" ");
           }
           

    }
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            int r=s.nextInt();
            arr[i]=r;
        }
        for(int i=0;i<n;i++){
            int r=arr[i];
            int ans[]=new int[r];
            arrange(ans, r);
            System.out.println();
        }

    }
}
