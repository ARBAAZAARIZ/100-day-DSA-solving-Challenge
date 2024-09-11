package FirstWeek;

// The array-form of an integer num is an array representing its digits in left to right order.
//
//For example, for num = 1321, the array form is [1,3,2,1].
//Given num, the array-form of an integer, and an integer k, return the array-form of
// the integer num + k.
//
//
//
//Example 1:
//
//Input: num = [1,2,0,0], k = 34
//Output: [1,2,3,4]
//Explanation: 1200 + 34 = 1234
//Example 2:
//
//Input: num = [2,7,4], k = 181
//Output: [4,5,5]
//Explanation: 274 + 181 = 455
//Example 3:
//
//Input: num = [2,1,5], k = 806
//Output: [1,0,2,1]
//Explanation: 215 + 806 = 1021

import java.util.*;
import java.util.Collections;



public class Add_to_Array_from_of_Integer_98 {
    public List<Integer> addToArrayForm(int[] num, int k){
        List<Integer> ans = new ArrayList<>();
        int p=num.length-1;
        int carry=0;         // 9 9 9 9 +1 =

        while(p>=0 || k>0){
            int numVal=0;
            if(p>=0){
                numVal=num[p];
            }
            int d=k%10;
            int sum=d+numVal+carry;
            int digit=sum%10;
            carry=sum/10;
            ans.add(digit);
            p--;
            k=k/10;

        }
        if (carry > 0) {

            ans.add(carry);
        }
        Collections.reverse(ans);


        return ans;
    }
    public static void main(String[] args) {
        int []num={9,6,1};
        Add_to_Array_from_of_Integer_98 add_num=new Add_to_Array_from_of_Integer_98();
        System.out.println(add_num.addToArrayForm(num,532));
    }
}
