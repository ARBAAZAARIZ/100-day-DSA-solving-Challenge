package Secondweek;


import java.util.Arrays;

public class Median_of_Two_Sorted_Arrays {
    public static void main(String[] args) {
        int num1[]={1,3};
        int num2[]={2};
        Median_of_Two_Sorted_Arrays medianOfTwoArray=new Median_of_Two_Sorted_Arrays();
        System.out.println(medianOfTwoArray.findMedianSortedArrays(num1,num2));
    }
        public double findMedianSortedArrays(int[] nums1, int[] nums2) {
            int counter=0;
            int tempNum[]=new int[nums1.length + nums2.length];
            for (int k : nums1) {

                tempNum[counter] = k;

                counter++;
            }
            for (int i : nums2) {
                tempNum[counter] = i;
                counter++;
            }
            System.out.println(Arrays.toString(tempNum));
            Arrays.sort(tempNum);
            System.out.println(Arrays.toString(tempNum));
            double ans=0;
            if(tempNum.length%2 == 0){
                 ans=tempNum[(tempNum.length/2)-1] + tempNum[(tempNum.length/2)+1];
                 ans=ans/2;

            }else{
                 ans=tempNum[tempNum.length/2];
            }
            return ans;


        }
}
