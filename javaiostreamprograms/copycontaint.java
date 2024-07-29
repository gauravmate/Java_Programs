package javaiostreamprograms;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class copycontaint {
    public static void main(String[] args)throws Exception {
       //create object of file input
       
       FileInputStream fin=new FileInputStream("D:\\gauravpath.\\demo.txt");
       FileOutputStream fout=new FileOutputStream("D:\\gauravpath.\\demo.txt");
       int x;
       do{
        x=fin.read();
        if(x!=-1){
            fout.write(x);
        }
       }while(x!=-1);
       fin.close();
       fout.close();
       System.out.println("file copied");
    }
}