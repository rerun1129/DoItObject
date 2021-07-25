package Singleton;

public class Company {

    private static Company company = new Company();  //유일한 인스턴스
                                                    //회사는 유일 고정되어 있어야 하는 개념이기 때문에 static

    private Company() {

    }

    public static Company getInstance() {           //인스턴스를 생성하지 않고 쓰기 위해서는 static 선언해야함

        return company;
    }
}
