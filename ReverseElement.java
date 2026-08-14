package Array;

public class ReverseElement {
    public static void revArray(int [] nums){
        int l = 0;
        int r = nums.length-1;
        while(l<r){
            int temp = nums[l];
            nums[l] =nums[r];
            nums[r] =temp;
            l++; r--;
        }
    }
    public static void main(String[] args){
        int nums[] ={2,4,7,6,3,8};
        revArray(nums);
        System.out.println("After Reversing:");
        for (int i=0;i<nums.length;i++){
            System.out.println(nums[i]+"");
        }
    }
}