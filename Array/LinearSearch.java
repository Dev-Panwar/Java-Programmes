import java.util.Scanner;
public class LinearSearch {
    public static int linearSearch(int arr[],int x){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==x){
                return i;
            }
        }
        int a=-1;
        return a;
    }
    public static int[] TakeInput(){ //() because it does not take any input from main.
        Scanner s=new Scanner(System.in);
        int size=s.nextInt();
        int input[]=new int[size];
        for(int i=0;i<size;i++){
        input[i]=s.nextInt();
        }
        return input;
    }
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int ans=0;
        int ans1[]=new int[n];
        for(int i=0;i<n;i++){
            int arr[]=TakeInput();
            int x=s.nextInt();
            ans=linearSearch(arr, x);
            ans1[i]=ans;
        }
        for(int i=0;i<n;i++){
        System.out.println(ans1[i]);
        }

    }
}


