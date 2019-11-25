package io;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class FileReader {
    public static void main(String[] args) throws IOException {
        String path = new String("C:\\Users\\Angus\\IdeaProjects\\Gjun_ch5\\reader.txt");
        java.io.FileReader fr;
        {
            fr = new java.io.FileReader(path);
            char data[] = new char[512];
            int num = fr.read(data);

            System.out.println("總共讀取" + num + "字元");
            for(int i=0; i<num; i++){
                System.out.print(data[i]);
            }
            System.out.println();
            String s = new String(data, 0, num);
            System.out.println("s,length" + s.length() + "\n" + s);

            FileWriter fw = new FileWriter("C:\\Users\\Angus\\IdeaProjects\\Gjun_ch5\\writer.txt", true);
            fw.write(data);
            fw.write(s);
            fr.close();
            fw.close();
        }
    }
}
