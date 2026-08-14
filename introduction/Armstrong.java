import java.util.Scanner;
public class Armstrong {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int arm=0;
        int temp=num;
        while(num>0){
           int rem=num%10;
           arm=rem*rem*rem+arm;
           num=num/10;
        }if(temp==arm){
            System.out.println("armstrong");
        }else{
            System.out.println("not armstrong");
        }
    }
    
}
