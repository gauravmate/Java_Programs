package collegeassignment;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class assignment6 {
  public static void main(String[] args) throws Exception, IOException,FileNotFoundException {

    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the data from file 1:");
    String data=sc.nextLine();
    FileOutputStream fos = new FileOutputStream("D:\\gauravpath.\\test.txt");
    byte[] array=data.getBytes();
    fos.write(array);
    fos.close();

    FileOutputStream fos1= new FileOutputStream("D:\\gauravpath.\\demo.txt");
    System.out.println("Enter the data from file 2:");
    String data1=sc.nextLine();
    array=data1.getBytes();
    fos1.write(array);
    fos1.close();
    System.out.println("File Copied");
        // create object of file input
        

    FileOutputStream f1 = new FileOutputStream("D:\\gauravpath.\\demo.txt",true);
    FileInputStream f2 = new FileInputStream("D:\\gauravpath.\\test.txt");
    int n;
    while ((n = f2.read()) != -1) {
      f1.write(n);
    }
    f1.close();
    f2.close();
    FileInputStream f3 = new FileInputStream("D:\\gauravpath.\\demo.txt");
    while((n=f3.read())!=-1){
      System.out.print((char)n);
    }

    f3.close();
  }
}
