import java.util.Scanner;
public class collage
 {
    public static void main(String[] args){
    Scanner sc = new Scanner (System.in);
    System.out.println("x:enter the number");                     
    {
        int remain,n;
        int sum=0,rev=0;
        n=sc.nextInt();
        if(n%2==0)
        {
            System.out.println("it is even number");
        }
        else
        {
            System.out.println("it is odd number");
        }
        while(n>0)
        {
             remain = n % 10;
             rev = rev * 10 + remain;
             n = n / 10;
             sum += remain;

        }
          System.out.println("the revers number"+rev);
          System.out.println("sum of revers number"+sum);
          sc.close();
     }

    }
}


