import java .util.Scanner;
public class Movieticket {
    public static void main (String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a age:");
        int age=sc.nextInt();
        System.out.println("Enter a ticket price:");
        float price=sc.nextFloat();
        float discount;
        float financialprice;
        if(age<=12){
           discount=50;
        }else if(age>=12&& age<=60){
             discount=0;
        }
        else {
            discount= 30;
        }
        financialprice=price-(price*discount/100);
        System.out.println("discount:"+discount);
        System.out.print("financialprice:"+financialprice);
}
}
