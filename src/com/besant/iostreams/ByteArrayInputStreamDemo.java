package com.besant.iostreams;

import java.io.ByteArrayInputStream;

public class ByteArrayInputStreamDemo {
    public static void main(String[] args) {

        byte[] val={1,3,4,6,2};
        ByteArrayInputStream byteArrayInputStream= new ByteArrayInputStream(val);

        System.out.println(byteArrayInputStream.available());

    }
}
