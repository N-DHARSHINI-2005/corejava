package Array;
import java.util.Scanner;
public class Maxmin {
            public static void findMaxMin(int[] num) {
                int max=num[0];
                for(int i=0;i<num.length;i++)
                    {
                    if(num[i]>max){
                        max=num[i];
                    }
                }
            System.out.println("maximumvalue: " + max);
        }






    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int[] num=new int[n];
       for(int i=0;i<n;i++){
        num[i]=sc.nextInt();       }
           
        

    
}

}