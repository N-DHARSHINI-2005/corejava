public class Specialnumber {
    public static void main(String[]args){
        int n=12;
        int m=20;
         for(int i=n;i<=m;i++){
           int digit1=i%10;
           int digits2=i/10;
           int sum=digit1+digits2;
           int product=digit1*digits2;
           int res=sum+product;
           if(res==i){
               System.out.println(i+" is a special number");
           }
    }
    
}
}