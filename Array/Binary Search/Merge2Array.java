public class Merge2Array {
    public static int[] merge(int arr1[], int arr2[]) {
    int a=arr1.length;
    int b=arr2.length;
    int arr3[]=new int[a+b];
    int i=0;
    int j=0;
    int k=0;
    while(i<a&&j<b){
        if(arr1[i]>arr2[j]){
            arr3[k]=arr2[j];
            j++;
            k++;
        }
           else if(arr1[i]<=arr2[j]){
                arr3[k]=arr1[i];
                i++;
                k++;
            }
        }
        while(i<a){
            arr3[k]=arr1[i];
            i++;
            k++;
        }
        while(j<b){
            arr3[k]=arr2[j];
            j++;
            k++;
        }
        return arr3;
        
    }
    public static void main(String[] args){
        int arr1[]={1,3,5,7};
        int arr2[]={2,4,6};
        int arr3[]=merge(arr1, arr2);
        for(int i=0;i<arr3.length;i++){
            System.out.print(arr3[i]+" ");
        }
        System.out.println();
    }
    }

