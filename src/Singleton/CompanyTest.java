package Singleton;

public class CompanyTest {


    public static void main(String[] args) {

        Company c1 = Company.getInstance();

        Company c2 = Company.getInstance();

        //Company c3 = new Company();             //error

        System.out.println(c1 + " " + c2);      //같은 정적 메모리를 쓰기 때문에 같은 정적 인스턴스를 불러왔으니
                                                //해쉬코드가 같다.


    }
}
