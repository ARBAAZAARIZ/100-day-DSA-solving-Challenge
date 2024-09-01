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




public class Add_to_Array_from_of_Integer_98 {
    public List<Long> addToArrayForm(int[] num, int k){
        long number=0;
        for(int n:num){
            number=(number*10) + n;
        }
        System.out.println(number);
        List<Long> l=new ArrayList<>();
        long result=number+k;
        while(result!=0){
            l.add(result%10);
            result=result/10;
        }
        Collections.reverse(l);
        return l;


    }
    public static void main(String[] args) {
        int []num={9,9,9,9,9,9,9,9,9,9};
        Add_to_Array_from_of_Integer_98 add=new Add_to_Array_from_of_Integer_98();
        System.out.println(add.addToArrayForm(num,1));
    }
}
