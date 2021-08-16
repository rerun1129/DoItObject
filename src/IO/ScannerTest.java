package IO;

import java.util.Scanner;

public class ScannerTest {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String name = in.nextLine();
        int num = in.nextInt();


        System.out.println(name);
        System.out.println(num);

    }

}
