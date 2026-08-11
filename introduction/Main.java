public class Main {
    public int addvalue(){
        int a=4;
        int b=5;
        int sum=a+b;
        return sum;
    }
    public static void main(String[]args){
        Main object=new Main();
        int result=object.addvalue();
        System.out.println("Result: " + result);
    }
}