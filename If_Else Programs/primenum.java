import java.util.Scanner;

public class primenum {
    public static void main(String[] args) {
        int i,m=0;
       // int n=7;
      Scanner sc=new Scanner(System.in);
       System.out.println("enter prime number 1 to 100");
       int n=sc.nextInt();

       m=n/2;
       if(n==0 || n==1)
       {
            System.out.println("It is not prime "+n);
       }
       else{
        for(i=10;i<=m;i++)
        {
            if(n%i==0)
            {
                System.out.println("It is  prime number "+n);
                
            }
        
        }
    }
       
}
    
}
