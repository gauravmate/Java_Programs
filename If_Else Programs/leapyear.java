import java.util.Scanner;
public class leapyear {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int year;
        System.out.println("enter a year");
        year=sc.nextInt();
        if(year %4==0){
            System.out.println("this is leap year");
        }else{
            System.out.println("this is not leap year");
        }
    }
    
}
