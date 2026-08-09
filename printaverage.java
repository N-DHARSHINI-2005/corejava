import java.util.Scanner;
public class printaverage{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        float a = sc.nextFloat();
        System.out.println("Enter second number: ");
        float b = sc.nextFloat();
        float printaverage = (a + b)/ 2;
        System.out.println("Average ="+printaverage);
        sc.close();
    }
}