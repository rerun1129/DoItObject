package IO;

import java.io.*;

public class DataInOutStreamTest {

    public static void main(String[] args) {
        try (FileOutputStream fos = new FileOutputStream("data.txt");
             DataOutputStream dos = new DataOutputStream(fos)) {
            dos.write(100);
            dos.writeInt(100);
            dos.writeChar('A');
            dos.writeUTF("하이!");
        } catch (IOException e) {
            System.out.println(e);

        }
        try (FileInputStream fis = new FileInputStream("data.txt");
             DataInputStream dis = new DataInputStream(fis)) {
            System.out.println(dis.read());
            System.out.println(dis.readInt());
            System.out.println(dis.readChar());
            System.out.println(dis.readUTF());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
