package collegeassignment;

import java.io.*;
import java.util.Scanner;

public class assignment2 {
    public static void main(String[] args) throws Exception {
        int nof = 0, nod = 0;
        String dirpath, extention;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a directory name :");
        dirpath = sc.nextLine();
        // System.out.println("Accept the extention :");
        // extention = sc.next();
        File f1 = new File(dirpath);
        if (f1.isDirectory()) {
            String str[] = f1.list();
            for (String s : str) {
                //nod++;
                File f2 = new File(dirpath, s);
                if (f2.isFile() ){
                    nof++;
                    System.out.println(s + " is a file");
                }  else {
                           nod++;
                    System.out.println(s + " is a directory");

                }

            }

        } 
            System.out.println("number off directory" + nod);
        System.out.println("number off file" + nof);
  

    }
}
