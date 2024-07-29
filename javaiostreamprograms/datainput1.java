package javaiostreamprograms;

import java.io.DataInputStream;
import java.io.FileInputStream;

public class datainput1 {
  public static void main(String[] args)throws Exception {
    
    FileInputStream fin=new FileInputStream("D:\\\\gauravpath.\\\\demo.txt");
    DataInputStream din=new DataInputStream(fin);
    int a=din.readInt();
    boolean b=din.readBoolean();
    float c=din.readFloat();
    System.out.println(a);
    System.out.println(b);
    System.out.println(c);

    din.close();

}  
}
