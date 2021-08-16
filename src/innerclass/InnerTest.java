package innerclass;

class OutClass{

 private int num = 10;
 private static int sNum = 20;
 private InClass inClass;

    public OutClass() {
        inClass = new InClass();
    }

    class InClass{
     int inNum = 200;

     //static int sInNum = 100;

        void inTest(){

            System.out.println(num);
            System.out.println(sNum);

        }

    }
    public void sTest(){

        inClass.inTest();
    }

}


public class InnerTest {

    public static void main(String[] args) {

        OutClass outClass = new OutClass();
        outClass.sTest();
        OutClass.InClass inClass = outClass.new InClass();
        inClass.inTest();

    }
}
