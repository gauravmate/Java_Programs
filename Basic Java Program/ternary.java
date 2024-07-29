import java.util.Scanner;
public class ternary {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a,b,max;
        System.out.println("enter two number");
        a=sc.nextInt();
        b=sc.nextInt();
        max=a>b?a:b;
        System.out.println("max value is"+max);
    } 
}
