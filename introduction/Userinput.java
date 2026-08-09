import java.util.Scanner;
class Userinput{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a name: ");
        String name = sc.nextLine( );
        System.out.print("Enter Your register number: ");
        int register_number= sc.nextInt();
        System.out.println("Enter Your Department");
        String department=sc.nextLine();
        System.out.println("Enter Your CGPA");
        float CGPA=sc.nextFloat();
        System.out.println("Name:"+name);
        System.out.println("Register Number:"+register_number);
        System.out.println("Department:"+department);
        System.out.println("CGPA:"+CGPA);
        sc.close();
    }
}
