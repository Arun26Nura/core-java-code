package com.besant.iostreams;

import javax.swing.plaf.FileChooserUI;
import java.io.*;

public class ObjectStreams {
    public static void main(String[] args) throws IOException {

        FileOutputStream fileOutputStream=
                new FileOutputStream("C:\\Users\\arunk\\OneDrive\\Documents\\Objectoutput.txt");
        ObjectOutputStream objectOutputStream= new ObjectOutputStream(fileOutputStream);

        objectOutputStream.writeBoolean(true);
        objectOutputStream.writeChars("Hello");
        objectOutputStream.writeLong(10000);
        objectOutputStream.close();

        FileInputStream fileInputStream= new FileInputStream("C:\\Users\\arunk\\OneDrive\\Documents\\Objectoutput.txt");
        ObjectInputStream objectInputStream= new ObjectInputStream(fileInputStream);
        System.out.println(objectInputStream.readBoolean());
        System.out.println(objectInputStream.readChar());
        System.out.println(objectInputStream.readLong());




    }
}
