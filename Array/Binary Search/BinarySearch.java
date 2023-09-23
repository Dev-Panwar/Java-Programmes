public class BinarySearch {
    public static int binarySearch(int[] arr, int x) {
    	int s=0,e=arr.length-1;
        int a=-1;
        while(s<=e){
            int middle=(s+e)/2;
    
            if(arr[middle]==x){
                return middle;
            }
            if(arr[middle]>x){
                e=middle-1;
                
            }
            if(arr[middle]<x){
                s=middle+1;
            
            }
        }
      return a; 
        
    }
    public static void main(String[] args){
        int []input={2,4,5,8,9,15,21,28};
        int index=binarySearch(input, 5);
        System.out.println(index);
    }
}
