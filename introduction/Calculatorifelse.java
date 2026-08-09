import java.util.Scanner;
public class Calculatorifelse{
 public static void main (String[]args){
    Scanner sc=new Scanner(System.in);
    System .out.println("Enter a values");
    float a=sc.nextFloat();
    System.out.println("Selected operator:");
    char ch =sc.next().charAt(0);
    System .out.println("Enter b values");
    float b=sc.nextFloat();
    switch(ch){
        case'+':
            System.out.println("Addition:"+(a+b));
            break;
        case'-':
             System.out.println("Subtraction:"+(a-b));
             break;
        case'*':
             System.out.println("Multiplication:"+(a*b));
             break;
        case'/':
        System .out.println("Division:"+(a/b));
        break;
        default:
            System.out.println("Invalid operator");    
    }

 }
}