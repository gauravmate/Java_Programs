import java.util.Scanner;
public class continues {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
    int a,b,c;
    String choice;
    do{
    System.out.println("Enter two number");
    a=sc.nextInt();
    b=sc.nextInt();
    c=a+b;
    System.out.println("addition is"+c);
    System.out.println("do you want to continues?(yes/no)");
    choice=sc.next();
}
while(choice.equals("yes"));
    
}
}
