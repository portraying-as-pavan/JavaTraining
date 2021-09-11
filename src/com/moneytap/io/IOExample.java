package com.moneytap.io;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class IOExample {
    public static void main(String[] args) throws IOException {

        String[] libraries=new String[]{"io","util","lang","collections"};
        FileOutputStream fos=new FileOutputStream("./resources/library.txt");

        for(String library:libraries){
            fos.write(library.concat(" ").getBytes(StandardCharsets.UTF_8));
        }
        fos.close();

        FileInputStream fis=new FileInputStream("./resources/library.txt");
        Scanner fileScanner =new Scanner(fis);

        while (fileScanner.hasNext()){
            System.out.println(fileScanner.next());
        }
        fis.close();

/*
        FileInputStream fis=new FileInputStream("./resources/input.txt");
        int c;
        while ((c=fis.read())!=-1){
            System.out.print((char)c);
        }

        fis.close();


 */
    }
}
