package javaiostreamprograms;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class readobjectofserializ {
    public static void main(String[] args)throws Exception {
        FileInputStream fin=new FileInputStream("C:\\Users\\gaurav\\OneDrive\\Desktop\\gaurav1\\test.txt");
        ObjectInputStream in=new ObjectInputStream(fin);
        student st2;
        st2=(student)in.readObject();
        System.out.println(st2.getId());
        System.out.println(st2.getName());
        in.close();
        
        
    }
}
