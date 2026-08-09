public class Simplewhile {
    public static void main(String[]args){
        int num=260;
        int n=5;
        int count=0;
        while(num>=n){
            count++;
            num=num/n;
        }
        System.out.println("count:"+count);
        }
}