package Secondweek;

import java.util.Arrays;

public class Squares_of_a_Sorted_Array {
    public int[] sortedSquares(int[] nums) {
        for (int i = 0; i <nums.length ; i++) {
            int x=nums[i];
            x=x*x;
            nums[i]=x;
        }
        Arrays.sort(nums);
                return nums;
    }

    public static void main(String[] args) {
        int nums[]={-4,-1,0,3,10};
        Squares_of_a_Sorted_Array n=new Squares_of_a_Sorted_Array();
        System.out.println(Arrays.toString(n.sortedSquares(nums)));

        boolean x = true;
        boolean y = false;
        boolean z = true;

        if(x & y | y & z | z)
            System.out.print("Hi");
        else
            System.out.print("Know Program");

        double a = 7.3;

        if(a == 7.3)
            System.out.print("Hi");
        else
            System.out.print("Know Program");
    }
}
