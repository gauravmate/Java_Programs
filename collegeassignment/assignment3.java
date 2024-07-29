package collegeassignment;
import java.io.ByteArrayInputStream;
import java.util.Scanner;

public class assignment3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a name:");
        String s = sc.nextLine();
        byte b[] = s.getBytes();
        ByteArrayInputStream bis = new ByteArrayInputStream(b);
        int n;
        while ((n = bis.read()) != -1) {
            System.out.print(Character.toUpperCase((char) n));
        }

    }

}
