package PBLWipro.javafundamentalprograms;
import java.util.Scanner;

public class primenumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        sc.close();
        int f=0;
        
        for(int i=2;i<=n/2;i++)
        {
           if(n%i==0)f=1;
        }
        if(f==0)
        {
            System.out.println("prime");
        }
        else System.out.println("not prime");

    }
}
