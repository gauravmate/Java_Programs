import java.util.Scanner;
public class choice1{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int x;
        System.out.println("enter 1,2 and 3");
        x=sc.nextInt();
        switch(x){
            case 1:
            System.out.println("one");
            break;
            case 2:
            System.out.println("two");
            break;
            case 3:
            System.out.println("three");
            break;
            case 4:
            System.out.println("wrong choice");
            break;
            }
    }
}