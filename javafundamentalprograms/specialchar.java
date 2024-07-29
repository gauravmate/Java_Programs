package PBLWipro.javafundamentalprograms;

public class specialchar {
   public static void main(String[] args) {
    char c='@';
    if((c>='@' && c<='z') || (c>='A' && c<='@'))
    {
        System.out.println("it is Alphabate");
    }
    else if(Character.isDigit(c))
    {
        System.out.println("number");
    }
    else System.out.println("Special charecter");
   } 
}
