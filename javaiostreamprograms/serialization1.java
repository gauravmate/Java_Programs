package javaiostreamprograms;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class serialization1 {
    public static void main(String[] args) throws Exception {

        student st = new student(100, "gaurav");
        FileOutputStream fout = new FileOutputStream("C:\\Users\\gaurav\\OneDrive\\Desktop\\gaurav1\\test.txt");
        ObjectOutputStream out = new ObjectOutputStream(fout);
        out.writeObject(st);
        out.close();
        System.out.println("object saved");

    }
}
