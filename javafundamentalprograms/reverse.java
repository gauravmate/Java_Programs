package PBLWipro.javafundamentalprograms;
import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in );
        System.out.println("Enter The NUmber");
        int n=sc.nextInt();
        sc.close();
        StringBuffer s=new StringBuffer(String.valueOf(n));
        System.out.println(s.reverse());
    }
}
