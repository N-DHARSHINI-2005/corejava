public class Ifelseif{
    public static void main (String []args){
        int age=45;
        if(age<=3){
            System.out.println("child");
        }else if(age>=4 && age<=12){
            System.out.println("teenager");
        }else if(age>=13 && age<=19){
            System.out.println("adult");
        }else {
            System.out.println("old");
        }
}
}