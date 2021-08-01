package inter;

public class Test {

    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 2;

        Calc calc = new CompleteCalc();     //이는 타입만 인터페이스 타입이고
                                            //인스턴스 생성은 CompleteCalc가 맡음
        //Calc calc1 = new Calc();            //인터페이스는 인스턴스 생성이 안됨
        //Calc calc2 = new Calculator();      //또한 추상메서드도 인스턴스 생성이 안됨

        //System.out.println(calc.add(num1, num2));
        calc.description();

        int [] arr = {1,2,4,5};
        int sum =Calc.total(arr);
        System.out.println(sum);

    }

}
