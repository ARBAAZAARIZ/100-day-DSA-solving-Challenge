package FirstWeek;

import java.util.Arrays;

public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        int[] result=new int[2];
        for(int i=0;i< nums.length;i++){
            for (int j = i+1; j < nums.length ; j++) {
//                for (int j = i + 1; j < nums.length; j++)
                if(nums[i]+nums[j]==target){
                    result[0]=i;
                    result[1]=j;
                    return result;
                }
            }
        }
        return result;
    }
    public static void main(String[]arg){
        // taking array input
        int arr[]={3,3};
        TwoSum t =new TwoSum();
        System.out.println(Arrays.toString(t.twoSum(arr,6)));

    }
}
