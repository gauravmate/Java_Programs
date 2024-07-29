package collegeassignment;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Scanner;

public class assignement4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name");
        String s = sc.nextLine();
        byte[] b = s.getBytes();
        ByteArrayInputStream bis = new ByteArrayInputStream(b);
        int n;
        char c;
        ByteArrayOutputStream bos = new ByteArrayOutputStream(b.length);
        while ((n = bis.read()) != -1) {
        c=(char)n;
        if(Character.isUpperCase(c)){
            c=Character.toLowerCase(c);
        }
        else if(Character.isLowerCase(c)){
            c=Character.toUpperCase(c);
         }
         bos.write((int)c);
        }
        System.out.println(bos.toString());
    }
}
