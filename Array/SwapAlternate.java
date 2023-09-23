public class SwapAlternate {

        public static void swapAlternate(int arr[]) {
            if(arr.length%2==0){
                for(int i=0;i<arr.length;i=i+2){
                    int a=arr[i];
                    int b=arr[i+1];
                    arr[i]=b;
                    arr[i+1]=a;
                }
            }
            if(arr.length%2 !=0){
                for(int i=0;i<arr.length-1;i=i+2){
                    int a=arr[i];
                    int b=arr[i+1];
                    arr[i]=b;
                    arr[i+1]=a; 
                }
            }
        }
      }
