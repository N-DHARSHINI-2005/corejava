import java.util.Scanner;

public class Primenumber {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        boolean prime=true;
        for(int j=2;j<=n;j++){
            boolean Prime =true;
        }
        for(int i=2;i<=n;i++){
            if(n%i==0){
                prime=false;
            }
        }
        if(prime){
        System.out.println(n+"");
        }
            
        

        

}}