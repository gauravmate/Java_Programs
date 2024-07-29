package PBLWipro.javafundamentalprograms;
import java.util.Scanner;

public class month {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a;
        String month[]={"jav", "feb", "mar","april","may","jun","july","aug","sep","oct","nov","dec"};
        a=sc.nextInt();
        sc.close();
        System.out.println(month[a]);
    }
}
