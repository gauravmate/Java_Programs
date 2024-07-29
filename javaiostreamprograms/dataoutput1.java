package javaiostreamprograms;

import java.io.DataOutputStream;
import java.io.FileOutputStream;

public class dataoutput1 {
    public static void main(String[] args)throws Exception {
        
        FileOutputStream fout=new FileOutputStream("D:\\gauravpath.\\demo.txt");
        DataOutputStream dout=new DataOutputStream(fout);

        dout.writeInt(100);
        dout.writeBoolean(true);
        dout.writeFloat(1.2f);

        System.out.println("File Copide");

    }
}
