package com.besant.iostreams;

import java.io.ByteArrayOutputStream;

public class ByteArrayOutputStreamDemo {
    public static void main(String[] args) {
        byte[] input= {1,3,5};
        ByteArrayOutputStream byteArrayOutputStream= new ByteArrayOutputStream();
        byteArrayOutputStream.writeBytes(input);
        byteArrayOutputStream.toByteArray();

    }
}
