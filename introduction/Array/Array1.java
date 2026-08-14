package Array;

import java.util.Scanner;

public class Array1 {
    public static void printArray (String[] args) {
        System.out.println("Names:");
        for(int i=0;i<args.length;i++){
            System.out.println(args[i]);
        }
    }
    public static void main (String[] args) {
        System.out.println();
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter Size of the Array : ");
    int Size=sc.nextInt();
    String names []=new String[Size];
    System.out.println("Enter elements of Array :");
    for(int i=0;i<Size;i++){
          names[i]=sc.next();

    }
    printArray(names);
}
}