package PBLWipro.javafundamentalprograms;
import java.util.Scanner;

public class sumofalldigit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the Number");
        int n=sc.nextInt();
        sc.close();
        int ans=0;
        String s=""+n;
        for(int i=0;i<s.length();i++)
        {
            int d=Character.getNumericValue(s.charAt(i));
            ans+=d;
        }
        System.out.println(ans);
    }
}
