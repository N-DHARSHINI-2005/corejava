import java.util.Scanner;
class Greatestoftwonumber{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a num1");
        int num1=sc.nextInt();
          System.out.println("Enter a num2");
        int num2=sc.nextInt();
        if(num1>=num2){
    System.out.println("true" );
        }
    else{
    System.out.println("false" );
    }
    }
}