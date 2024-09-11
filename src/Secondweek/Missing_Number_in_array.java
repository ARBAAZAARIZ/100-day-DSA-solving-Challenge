package Secondweek;


import java.util.Arrays;

public class Missing_Number_in_array {
    //weh have used brute force this will take n2 time
//    int missing_number(int nums[]){
//        int counter=0;
//        boolean isTrue=false;
//        for (int i = 0; i <=nums.length ; i++) {
//            isTrue=false;
//            for (int j = 0; j <nums.length ; j++) {
//                if(i==nums[j]){
//                    isTrue=true;
//                    break;
//                }
//            }                                          // {9,6,4,2,3,5,7,0,1};
//            if(isTrue == false){
//                break;
//            }
//            counter ++;
//        }
//       if(isTrue==false){
//           return counter;
//       }else{return -1;}
//
//
//    }

    int missing_number(int nums[]){

        int range=nums.length;
        int rangeSum= (range*(range+1))/2;      // to take out n numbers of sum we this formula (n(n+1))/2
        int currentSum=0;
        for(int num : nums){
            currentSum=currentSum+num;
        }

        int ans=rangeSum - currentSum;
        return ans;
    }
    public static void main(String[] args) {
        Missing_Number_in_array m=new Missing_Number_in_array();
        int nums[]={9,6,4,2,3,5,7,0,1};
        System.out.println(m.missing_number(nums));

    }
}
