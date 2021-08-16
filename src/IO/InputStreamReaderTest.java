package IO;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamReaderTest {

    public static void main(String[] args) {
        try (InputStreamReader fis = new InputStreamReader(new FileInputStream("read.txt"))) {

            int i;
            while ((i = fis.read()) != -1) {
                    System.out.print((char) i);

                System.out.println();
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }

}
