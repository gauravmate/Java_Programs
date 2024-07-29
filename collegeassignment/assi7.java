package collegeassignment;

import java.io.*;
import java.util.Scanner;

public class assi7 {
    public static void main(String[] args)throws IOException {
        Scanner sc = new Scanner(System.in);
        FileWriter fw = new FileWriter("D:\\gauravpath\\demo.txt");

        String str;
        System.out.println("Enter the strings:");
        str=sc.next();
        do{
            str = sc.next();
            if(str.equals("stop"))
            break;

            fw.write(str + "\n");
        } while(!str.equals("stop"));
        fw.close();

        BufferedReader br = new BufferedReader(new FileReader("D:\\gauravpath\\demo.txt"));
        int max = 0;
        String temp = "";

        while((str = br.readLine()) != null) {
            if(str.length() > max ){
                max = str.length();
                temp = str;
            }
        }
        System.out.println("String Name: " +temp + "\nSize is: " +max);
        br.close();
        
    }
}
