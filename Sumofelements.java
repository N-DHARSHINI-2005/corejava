import java.util.Scanner;

public class Sumofelements {
    public static int findArraySum(int [] nums){
        int sum = 0;
        for(int i=0;i<nums.length;i++){
            sum = sum+nums[i];
        }
        return sum;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nums [] = new int[n];
        for(int i=0;i<n;i++){
            nums[i] =sc.nextInt();
        }
        int res = findArraySum(nums);
        System.out.println("Sum:"+res);

        sc.close();
    }
}
