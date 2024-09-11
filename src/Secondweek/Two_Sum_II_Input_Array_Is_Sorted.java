package Secondweek;

import java.util.Arrays;

//    leecode problem no :- 167
public class Two_Sum_II_Input_Array_Is_Sorted {
    public int[] twoSum(int[] numbers, int target) {
        int pre=0;
        int suf=numbers.length-1;
        int numLength=numbers.length;
        int [] ans =new int[2];
        for (int i = 0; i <numLength ; i++) {
            if(numbers[pre] + numbers[suf] == target){
                ans[0]=pre+1;
                ans[1]=suf+1;
                break;
            } else if (numbers[pre] + numbers[suf] > target) {
                suf--;
            } else if (numbers[pre] + numbers[suf] < target) {
                pre++;
            }
        }
        return ans;


    }

    public static void main(String[] args) {
        Two_Sum_II_Input_Array_Is_Sorted test =new Two_Sum_II_Input_Array_Is_Sorted();
        int []number={2,7,11,15};
        System.out.println(Arrays.toString(test.twoSum(number,9)));
    }

}
