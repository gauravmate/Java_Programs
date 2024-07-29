package javaiostreamprograms;

import java.io.ByteArrayInputStream;
import java.io.CharArrayReader;

public class characterioclasses {
    public static void main(String[] args) throws Exception {
        // String s1 ="\u0917\u094C\u0930\u0935";
        // byte[] arr=s1.getBytes();
        // ByteArrayInputStream bin=new ByteArrayInputStream(arr);
        // int x;
        // do{
        // x=bin.read();
        // System.out.println((char)x);

        // }
        // while(x!=-1);

        String s1 = "";
        char[] arr = s1.toCharArray();
        CharArrayReader bin = new CharArrayReader(arr);
        int x;
        do {
            x = bin.read();
            System.out.println((char) x);

        } while (x != -1);

    }
}
