package com.besant.iostreams;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderAndWriter {
    public static void main(String[] args) throws IOException {
        FileReader fileReader= new FileReader("C:\\Users\\arunk\\OneDrive\\Documents\\new.txt");
        var data= fileReader.read();
        while(data!=-1){
            System.out.println((char) data);
            data= fileReader.read();
        }

        FileWriter fileWriter= new FileWriter("C:\\Users\\arunk\\OneDrive\\Documents\\writer.txt");
        fileWriter.write("File Writer class");

        fileReader.close();
        fileWriter.close();



    }
}
