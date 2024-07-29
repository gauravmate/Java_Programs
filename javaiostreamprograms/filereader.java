package javaiostreamprograms;

import java.io.FileReader;

public class filereader {
    public static void main(String[] args)throws Exception {
     
        FileReader fin=new FileReader("D:\\gauravpath.\\demo.txt");
        int x;
        do{
            x=fin.read();
            System.out.print((char)x);
        }while(x!=-1);
        fin.close();
    }

}
