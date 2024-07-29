package javaiostreamprograms;
import java.io.*;
public class fileinput1 {
   public static void main(String[] args) throws Exception {
    
    //crreat object of fileinputstream
    FileInputStream fin=new FileInputStream("D:\\gauravpath.\\demo.txt");
    int x;
    do{
        x=fin.read();
        System.out.println((char)x);

        }while(x!=-1);
        fin.close();
   } 
}
