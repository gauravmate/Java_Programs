package javaiostreamprograms;

import java.io.File;

public class readattributes {
    public static void main(String[] args) throws Exception {
        File f = new File("D:\\gaurav1");
        System.out.println("name  " + f.getName());
        System.out.println("name  " + f.getPath());
        System.out.println("name  " + f.getParent());
        System.out.println("name  " + f.length());
        System.out.println("name" + f.isFile());
        System.out.println("name" + f.isDirectory());

    }
}
