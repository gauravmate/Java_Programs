package collegeassignment;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class assignment5 {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        FileInputStream fis;

        int n, a;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("\n1. All String print\n2.Alternation String print\n3.Skip 3 Character ");
            fis = new FileInputStream("D:\\gauravpath\\demo.txt");

            System.out.println("Enter the choice");
            a = sc.nextInt();
            switch (a) {
                case 1:
                    while ((n = fis.read()) != -1) {
                        System.out.print((char) n);
                    }
                    break;
                case 2: //.skip(3);
                    while ((n = fis.read()) != -1) {
                        System.out.print((char) n);
                        fis.skip(1);
                    }
                    break;
                case 3: fis.skip(2);
                    while ((n = fis.read()) != -1) {
                        System.out.print((char) n);
                        fis.skip(2);
                    }
                    break;
                    
                }
            } while (a != 0);
            fis.close();
    }
}
