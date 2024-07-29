package PBLWipro.javafundamentalprograms;

public class lowercase {
    public static void main(String[] args) {
        char c='A';
        if(Character.isLowerCase(c))
        {
            System.out.println(Character.toUpperCase(c));
        }
        else System.out.println(Character.toLowerCase(c));
    }
}
