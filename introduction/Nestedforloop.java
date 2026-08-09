public class Nestedforloop {
    public static void main(String[] args) {
        //outer for loop "i"
        for (int i = 1; i <= 5; i++) {
            //inner loop for "j"
            for (int j = 1; j <= 6; j++)
             {
                System.out.print("i:" + i + " j:" + j);
            }
        
        }
    }
}