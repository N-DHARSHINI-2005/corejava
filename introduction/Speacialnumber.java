import java.util.Scanner;
public class Speacialnumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
    
        for(int num=n;num<=m;num++);
        {
            int digit1= n%10;
            int digit2= m/10;
            int sum=digit1+digit2;
            int product=digit1*digit2;
            int res=sum+product;
        if(res==num){
            System.out.println(i+"");
   }
}
    }
}
