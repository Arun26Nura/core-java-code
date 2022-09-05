package com.besant.iostreams;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamSample {
    public static void main(String[] args) throws IOException {

       var input= new FileInputStream("C:\\Users\\arunk\\OneDrive\\Documents\\new.txt");
        System.out.println((char) input.read());
        System.out.println((char) input.read());
    }
}
