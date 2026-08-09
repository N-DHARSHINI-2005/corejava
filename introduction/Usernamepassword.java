import java.util.Scanner;
class Usernamepassword{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a username");
        String username =sc.nextLine();
        System.out.println("Enter a password");
        int password =sc.nextInt();
        if(username.isEmpty()){
        System.out.println("invalid username");}
        else if(String.valueOf(password).length()==6){
            System.out.println("login succesfully");
        }else{
            System.out.println("invalid password");
        }
    }
}

