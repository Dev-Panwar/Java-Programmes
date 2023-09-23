public class PrintLeaders {
    public static void leaders(int [] arr){
        for(int i=0;i<arr.length;i++){
            int j;
            for(j=i+1;j<arr.length;j++){
                if(arr[j]>arr[i]){
                    break;
                }
            }
            if(j==arr.length){
            System.out.print(arr[i]+" ");
            }
        }
          }
   
       public static void main(String[] args){
          int arr[]={13,34,2,0,-1};
          leaders(arr);
       }
}
