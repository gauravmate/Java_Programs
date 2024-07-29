package PBLWipro.javafundamentalprograms;

import java.util.Scanner;

public class addition {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int s1, s2, s3;
        System.out.println("Enter Two Number");
        s1=sc.nextInt();
        s2=sc.nextInt();
        s3=s1+s2;
        System.out.println("The Sum of"+s3);

    }
}
