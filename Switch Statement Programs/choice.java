import java.util.Scanner;
public class choice {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String choice;
        int x,y,z;
        System.out.println("enter tpur choice");
        choice=sc.next();
        System.out.println("enter two number");
        x=sc.nextInt();
        y=sc.nextInt();
        switch(choice){
            case "+":
            z=x+y;
            System.out.println("addition of"+z);
            break;
            case "-":
            z=x-y;
            System.out.println("subtraction of"+z);
            break;
            case "*":
            z=x*y;
            System.out.println("multiplication of"+z);
            break;
            case "/":
            z=x/y;
            System.out.println("division of"+z);
            break;
        }
    }
}
