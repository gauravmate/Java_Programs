package javaiostreamprograms;

import java.io.File;

public class listoutfiles {
    public static void main(String[] args) throws Exception {
        // create only name

        // File f=new File("C:\\Users\\gaurav\\OneDrive\\Desktop\\gaurav1");
        // String [] arr=f.list();
        // for (String n : arr) {
        // System.out.println(n);
        // }

        // print number of dir and file
        int nof = 0, nod = 0;
        File f = new File("D:\\gauravpath");
        File[] arr = f.listFiles();
        String[] arr1 = f.list();
        for (String n : arr1) {
            System.out.println(n);
        }
        for (File file : arr) {
            if (file.isFile()) {
                nof++;
            } else if (file.isDirectory()) {
                nod++;
            }
        }
        
        System.out.println("number off directory" + nod);
        System.out.println("number off file" + nof);

    }
}
