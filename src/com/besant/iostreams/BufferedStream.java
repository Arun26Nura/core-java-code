package com.besant.iostreams;

import java.io.*;

public class BufferedStream {
    public static void main(String[] args) {

        {
            try {
                FileInputStream fileInputStream= new FileInputStream("C:\\Users\\arunk\\OneDrive\\Documents\\new.txt");
                BufferedInputStream input= new BufferedInputStream(fileInputStream);

         /*   var val= input.read();

            while(val !=-1){
                System.out.print((char) val);
                val=input.read();
            }*/
                byte[] array= input.readAllBytes();
                FileOutputStream fileOutputStream=
                        new FileOutputStream("C:\\Users\\arunk\\OneDrive\\Documents\\bufferedoutput.txt");
                BufferedOutputStream bufferedOutputStream= new BufferedOutputStream(fileOutputStream);
                bufferedOutputStream.write(array);

                input.close();
                bufferedOutputStream.close();

            } catch (IOException e) {
                throw new RuntimeException(e);
            }



        }
    }
}
