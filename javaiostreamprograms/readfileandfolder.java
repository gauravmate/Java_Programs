package javaiostreamprograms;

import java.io.File;

public class readfileandfolder {
    public static void main(String[] args)throws Exception {
        File f=new File("D:\\demo\\test2.txt");
        f.createNewFile();

        File n=new File("D:\\demo\\test2.txt"); 
        n.mkdir();

        
        
    }
}
