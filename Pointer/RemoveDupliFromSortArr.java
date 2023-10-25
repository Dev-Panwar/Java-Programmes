package MasterDSA.TwoPointers;

import java.util.Arrays;
import java.util.HashSet;

public class RemoveDupliFromSortArr {
    public static void main(String[] args) {
        int[]arr={1,2,3,3,4,5,5,6};
        System.out.println(removeDuplicates(arr));
        System.out.println(Arrays.toString(arr));
    }
    static int removeDuplicates(int[] nums) {

        int i=0;  //left pointer
        int j=1;  //right pointer

        while (j<nums.length){

            if (nums[i]!=nums[j]){
                i++;
                nums[i]=nums[j];
            }
            j++;
        }
       return i+1;
    }
}
