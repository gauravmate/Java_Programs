package PBLWipro.javafundamentalprograms;

import java.util.Scanner;

public class oddeven {
    public static void main(String[] args) {
        int b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A Number");
        b = sc.nextInt();
        if (b % 2 == 0) {
            System.out.println("even");
        } else
            System.out.println("Odd");
    }
}
