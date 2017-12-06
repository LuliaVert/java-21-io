package com.company;
import java.io.*;


public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here
        File file = new File ("/Users/LuliaVert/Desktop/Untitled.txt");
        InputStream inputStream = new FileInputStream(file);
        OutputStream outputStream = System.out;
        copy(inputStream,outputStream);
    }
    private static void copy (InputStream inputStream, OutputStream outputStream) throws IOException{
        byte [] buff = new byte[64*1024];

        while (inputStream.available()>0){
            int count = inputStream.read(buff);

            outputStream.write(buff,0, count);
        }
        inputStream.close();
        outputStream.close();
    }
}
