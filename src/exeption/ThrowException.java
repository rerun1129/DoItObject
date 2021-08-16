package exeption;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowException {

    public Class loadClass(String fileName, String className) throws FileNotFoundException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream(fileName);
       Class c = Class.forName(className);
        return c;
    }

    public static void main(String[] args) {

        ThrowException ex = new ThrowException();
        try {
            ex.loadClass("input.txt", "java.lang.String");
        } catch (FileNotFoundException exception) {
            System.out.println(exception);
        } catch (ClassNotFoundException classNotFoundException) {
            System.out.println(classNotFoundException);
        }
        System.out.println("end");
    }
}
