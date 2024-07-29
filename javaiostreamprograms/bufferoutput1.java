package javaiostreamprograms;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class bufferoutput1 {
    
    public static void main(String[] args)throws Exception {
        FileInputStream fin=new FileInputStream("D:\\gauravpath.\\demo.txt");
        BufferedInputStream bin=new BufferedInputStream(fin);
        FileOutputStream fout=new FileOutputStream("D:\\gauravpath\\demo.txt");
        BufferedOutputStream bout=new BufferedOutputStream(fout);

        int x;
        do{
            x=bin.read();
            if(x!=-1){
                bout.write(x);
            }
        }
        while(x!=-1);
        bin.close();
        bout.close();
        System.out.println("file copied");
    }
}
