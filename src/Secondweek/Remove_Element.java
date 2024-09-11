package Secondweek;

public class Remove_Element {
    public int removeElement(int[] nums, int val) {
        int pointer=0;

        for(int num:nums){
            if(num != val){
                nums[pointer]=num;
                pointer ++;
            }
        }
        return pointer;
    }

    public static void main(String[] args) {
        Remove_Element r=new Remove_Element();
        int nums[]={0,1,2,2,3,0,4,2};
        System.out.println(r.removeElement(nums,2));
    }

}
