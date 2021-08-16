package IO;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileTest {

    public static void main(String[] args) throws IOException {
        RandomAccessFile rf = new RandomAccessFile("random.txt","rw");
        rf.writeInt(100);                       //4
        System.out.println(rf.getFilePointer());
        rf.writeDouble(3.14);                   //8
        System.out.println(rf.getFilePointer());
        rf.writeUTF("안녕하세요");               //3*5 + 2 = 17
        System.out.println(rf.getFilePointer());

        rf.seek(0);
        System.out.println(rf.getFilePointer());
        int i = rf.readInt();
        System.out.println(rf.getFilePointer());
        double d = rf.readDouble();
        System.out.println(rf.getFilePointer());
        String s = rf.readUTF();
        System.out.println(rf.getFilePointer());

        System.out.println(i);
        System.out.println(d);
        System.out.println(s);
    }
}
