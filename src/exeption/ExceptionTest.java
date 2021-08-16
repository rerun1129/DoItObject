package exeption;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionTest {

    public static void main(String[] args) {


        try (FileInputStream fis = new FileInputStream("input.txt");) {

        } catch (IOException exception) {
            exception.printStackTrace();
        }
        System.out.println("fin");
    }
}

