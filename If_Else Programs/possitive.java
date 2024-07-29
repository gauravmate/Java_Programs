import java.util.Scanner;
public class possitive {
    public static void main(String[] args){
    Scanner sc=new Scanner (System.in);
    int a;
    System.out.println("enter a number");
    a=sc.nextInt();
    if(a>0){
        System.out.println("possitive number");
    }else if(a<0){
        System.out.println("negitive number");
    }else{
        System.out.println("0 print");
    }
}
    
}
