import java.util.Scanner;
public class evenodd {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a,b;
        System.out.println("enter number");
        a=sc.nextInt();
        b=a%2;
        if(b==0)
        {
            System.out.println("even number");
        }
        else{
            System.out.println("odd number");
        }
    }
}
