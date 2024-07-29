package PBLWipro.javafundamentalprograms;

import java.util.Scanner;

public class possitivenagetive {
    public static void main(String[] args) {
        int a;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter A Number");
        a=sc.nextInt();

        if(a<0){
            System.out.println("negative");
        }
        else if(a==0){
            System.out.println("zero");
        }
        else System.out.println("positive");
    }
}
