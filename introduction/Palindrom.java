import java.util.Scanner;
public class Palindrom{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a palindrom");
        String palindrom=sc.nextLine();
        String reverse="";
        for(int i=palindrom.length()-1;i>=0;i--){
            reverse=reverse+palindrom.charAt(i);
        }
        if(palindrom.equals(reverse)) {
            System .out.println("palindrome");
        }else{
            System.out.println("notpalindrom");
        }

    }
}