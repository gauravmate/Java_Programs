package javaiostreamprograms;

import java.io.*;

public class fileoutput1 {
    public static void main(String[] args) throws Exception {

        // crreat object of fileinputstream
        FileInputStream fin = new FileInputStream("C:\\Users\\gaurav\\OneDrive\\Desktop\\text.txt");
        FileOutputStream fout = new FileOutputStream("C:\\Users\\gaurav\\OneDrive\\Desktop\\text2.txt");
        int x;
        do {
            x = fin.read();
            if (x != -1) {
                fout.write(x);
            }

        } while (x != -1);
        fin.close();
        fout.close();
        System.out.println("file copied");
    }
}
