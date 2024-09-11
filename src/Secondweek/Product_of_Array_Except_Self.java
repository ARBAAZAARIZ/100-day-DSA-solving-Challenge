package Secondweek;
import java.util.Arrays;
public class Product_of_Array_Except_Self {
    public int[] product_itself(int[] nums){
        int[] ans =new int[nums.length];

        ans[0]=1;
        for (int i =1; i < nums.length ; i++) {
            ans[i]=ans[i-1] * nums[i-1];
        }
        int suffix=1;
        for (int i = nums.length-1; i >=0 ; i--) {
            ans[i]=ans[i] * suffix;
            suffix=suffix * nums[i];
        }
        return ans;
    }
    public static void main(String[] args) {
        Product_of_Array_Except_Self product = new Product_of_Array_Except_Self();
        int[] nums ={1,2,3,4};
        System.out.println(Arrays.toString(product.product_itself(nums)));

    }

}
