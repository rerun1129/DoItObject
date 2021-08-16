package lambda;


interface PrintString{
    void showString(String str);
}

public class LambdaTest {

    public static void main(String[] args) {

        PrintString lambdaPrint = System.out::println;

        lambdaPrint.showString("test");

        showMyString(lambdaPrint);

        PrintString reStr = returnPrint();
        reStr.showString("test3");

    }


    public static void showMyString(PrintString lambda){

        lambda.showString("test2");

    }

    public static PrintString returnPrint(){
        return s -> System.out.println(s + "world");

    }
}
