package com.besant.iostreams;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputStreamDemo {
    public static void main(String[] args) throws IOException {
        FileInputStream input=null;
        try {
            input= new FileInputStream("C:\\Users\\arunk\\OneDrive\\Documents\\new.txt");
/*
            var val= input.read();

            while(val !=-1){
                System.out.print((char) val);
                val=input.read();
            }*/


            byte[] array= input.readAllBytes();

            //input.read(array);
            String val= new String(array);
            System.out.println(val);

            FileOutputStream fileOutputStream= new FileOutputStream("C:\\Users\\arunk\\OneDrive\\Documents\\output.txt");
            fileOutputStream.write(array);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        finally {
            input.close();
        }


    }
}
