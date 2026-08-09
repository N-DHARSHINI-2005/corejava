import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a temperature");
        int temp =sc.nextInt();
        if(temp<20){
        System.out.println("water is cold");}
        else if(temp>=20&&temp<=40){
            System.out.println("Water is normal");
        }else{
            System.out.println("Water is hot");
        }
    }
}
