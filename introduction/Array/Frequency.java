package Array;
import java.util.Scanner;
public class Frequency {
    public static void main(String[] args) {
        int nums[]={2,2,3,4,2};
        boolean visited[]=new boolean[nums.length];
        int len=nums.length;
        for(int i=0;i<len;i++){
            if(visited[i]==false){
               int  count=1;
                visited[i]=true;
                {
                    for(int j=i+1;j<len;j++){
                        count++;
                    visited[i]=true;
                    }
                }
            System.out.println(nums[i]+"->"+count);
            }

        }

    }
    
}
