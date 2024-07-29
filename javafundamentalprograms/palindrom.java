package PBLWipro.javafundamentalprograms;
import java.util.Scanner;

public class palindrom {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter the number");
        n=sc.nextInt();
        int n1=0;
        int temp=n;
        while(n>0)
        {
            int t=n%10;
            n1=n1*10+t;
            n/=10;
        }
        if(temp==n1)
        {
            System.out.println("palindrom");
        }
        else System.out.println("not palindrom");
    }
}
