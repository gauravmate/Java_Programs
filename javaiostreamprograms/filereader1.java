package javaiostreamprograms;

import java.io.BufferedReader;
import java.io.FileReader;

public class filereader1 {
   public static void main(String[] args)throws Exception {
    
    FileReader fin=new FileReader("D:\\gauravpath.\\demo.txt");
    BufferedReader bin=new BufferedReader(fin);
    String line="";
    while ((line=bin.readLine())!=null);
        System.out.println(line);
    
    bin.close();
   } 
}
