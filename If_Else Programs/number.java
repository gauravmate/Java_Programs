import java.util.Scanner;
public class number {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a,b,c;
        System.out.println("enter 3 number");
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        if(a>b && a>c)
        {
            System.out.println("A is max");
        }else if(b>a && b>c){
            System.out.println("B is max");
        }else{
            System.out.println("C is max");
        }
    }
}
