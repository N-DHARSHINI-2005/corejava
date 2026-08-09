import java.util.Scanner;
public class Celsiusfahrenheit{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a celsius");
        double celsius=sc.nextDouble();
       double fahrenheit=(celsius*9/5)+32;
       System .out.println("fahrenheit:"+fahrenheit);
        }
}