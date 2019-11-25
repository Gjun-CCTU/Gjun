package io;

import java.io.*;

public class FileInputStream {
    public static void main(String[] args) throws IOException {
        String path = new String("C:\\Users\\Angus\\IdeaProjects\\Gjun_ch5\\reader.txt");
        java.io.FileInputStream fis = new java.io.FileInputStream(path);
        BufferedInputStream bis = new BufferedInputStream(fis);
        byte data[] = new byte[bis.available()];
        int num = bis.read(data);
        System.out.println("總共讀取" + num + "位元數");
        FileOutputStream fos = new FileOutputStream("C:\\Users\\Angus\\IdeaProjects\\Gjun_ch5\\writerr.txt");
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        bos.write(data);
        bis.close();
        bos.flush();
        bos.close();





    }
}
