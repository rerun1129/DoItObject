package IO;

import java.io.*;

public class FileCopyTest {


    public static void main(String[] args) {
        long seconds= 0;
        int len = 0;

        try (FileInputStream fis = new FileInputStream("a.exe");
             FileOutputStream fos = new FileOutputStream("b.exe");
             BufferedInputStream bis = new BufferedInputStream(fis);
             BufferedOutputStream bos = new BufferedOutputStream(fos)){
            int i;
            seconds = System.currentTimeMillis();
            while ((i =bis.read()) != -1){
                bos.write(i);
                len++;
            }
            seconds = System.currentTimeMillis() - seconds;

        } catch (IOException e) {
            System.out.println(e);
        }
        System.out.println(seconds);
        System.out.println(len);
    }
}
