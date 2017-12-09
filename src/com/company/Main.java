package com.company;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException{
        //InputStream inputStream = new URL("https://google.com").openStream();
	    File file = new File("/Users/alexandrpryakhin/IdeaProjects/41_Input_Output_6_12_2017/FileToRead.txt");
        InputStream inputStream = new FileInputStream(file);
        OutputStream outputStream = System.out;
        copy(inputStream,outputStream);
    }

    private static void copy(InputStream inputStream,OutputStream outputStream)throws IOException{
        // how many data to read in the row. If no buffer - will read byte per byte - worst option
        byte [] buff = new byte[64*1024];
        while (inputStream.available()>0){
            int count = inputStream.read(buff);
            outputStream.write(buff,0,count);
        }
        inputStream.close();
        outputStream.close();
    }
}
