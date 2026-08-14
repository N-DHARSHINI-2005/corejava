import java.util.Scanner;
public class Primenumber1 {
 Scanner sc=new Scanner(System.in);
 int num=sc.nextInt();
 boolean prime =true;
 for(int i=2;i<=num;i++){
    if(num/i==0){
        prime=false;

    }if(prime){
        System.out.println("eligiible");
    }else{
        System.out.println("not eligble");
    }
 }   
}

