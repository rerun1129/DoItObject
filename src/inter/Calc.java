package inter;

public interface Calc {

    double PI = 3.14;                   //public static final이 모두 생략되어 있다.
    int ERROR = -9999999;

    int add(int num1, int num2);
    int minus(int num1, int num2);
    int times(int num1, int num2);
    int divide(int num1, int num2);

    default void description(){
        System.out.println("정수 계산기를 구현합니다.");
    }



}
