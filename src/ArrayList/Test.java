package ArrayList;

public class Test {



    public static void main(String[] args) {

        char [] alpha = new char[26];

        char ch = 'A';

        for(int i =0; i<alpha.length; i++){
            alpha[i] = ch++;

            System.out.print(alpha[i]);

        }
    }
}
