package com.besant.iostreams;

import java.io.*;

public class InputStreamDemo {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream= new FileInputStream("C:\\Users\\arunk\\OneDrive\\Documents\\new.txt");
        InputStreamReader inputStreamReader= new InputStreamReader(fileInputStream);

        System.out.println((char) inputStreamReader.read());

        FileOutputStream outputStream= new FileOutputStream("C:\\Users\\arunk\\OneDrive\\Documents\\outwriter.txt");
        OutputStreamWriter outputStreamWriter= new OutputStreamWriter(outputStream);
        outputStreamWriter.write("Hello");
        outputStreamWriter.write("World".toCharArray());
        outputStreamWriter.write("World".toCharArray(), 3,1);
        outputStreamWriter.close();







    }
}
