import java.util.Scanner;
class Areaofcircle{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a radius");
        double radius=sc.nextDouble();
        double area= 3.14* radius*radius;
    System.out.println("Area of circle:"+area );
    }
}