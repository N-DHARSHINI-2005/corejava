import java.util.Scanner;
class Circulararea{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a radius");
        float radius=sc.nextFloat();
        float Area=3.14f*radius*radius;
        System.out.println("Area of the circle:"+Area);
    }
}
    

