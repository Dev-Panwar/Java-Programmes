import java.util.Scanner;

public class Arrayinfunction {
    public static int LargestInArray(int input[]){
        int Max=Integer.MIN_VALUE;
        for(int i=0;i<input.length;i++){
            if(input[i]>Max){
                Max=input[i];
            }
        }
        return Max;
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
    public static void print(int input[]){
        int size=input.length; //array.length gives length or size of an array
        for(int i=0;i<size;i++){
            System.out.print(input[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args){
     int arr[]=TakeInput(); //we store returned value from TakeInput function into main function
        print(arr);    //sending to print functions.
        int Largest=LargestInArray(arr);
        System.out.println("Largest is "+Largest);
    }
}
