public class SumOf2Arrays {
    public static void sumOfTwoArrays(int arr1[], int arr2[], int output[]) {
        int carry=0;
      int i=arr1.length-1;
      int j=arr2.length-1;
      int k=output.length-1;
      int num;
      while(i>=0&&j>=0){
          num=arr1[i]+arr2[j]+carry;
          
          if(num>9){
              carry=num/10;
              output[k]=num%10;
              i--;
              j--;
              k--;
          }
          else if(num<=9){
              output[k]=num;
              carry=0;
              i--;
              j--;
              k--;
          }
          
      }
      while(i>=0){
          num=arr1[i]+carry;
          if(num>9){
              carry=num/10;
              output[k]=num%10;
              i--;
              k--; 
          }
          else if(num<=9){
              output[k]=num;
              carry=0;
              i--;
              k--;
          }
      }
      while(j>=0){
          num=arr1[j]+carry;
          if(num>9){
              carry=num/10;
              output[k]=num%10;
              j--;
              k--; 
          } 
          if(num<=9){
              output[k]=num;
              carry=0;
              j--;
              k--;
          }
          
      }
      if(k==0){
          output[k]=carry;

  }
  }
  public static void main(String[]args){
      int arr1[]={9,9,9,1,3,4};
      int arr2[]={2,0,6,6};
      int l=0;
      if(arr1.length>arr2.length){
          l=arr1.length+1;

      }
      else{
          l=arr2.length+1;
      }
      int arr3[]=new int[l];
      sumOfTwoArrays(arr1, arr2, arr3);
      for(int i=0;i<arr3.length;i++){
          System.out.print(arr3[i]+" ");
      }
      System.out.println();
  }
}
