package allClass;

public class ClassTest {

    public static void main(String[] args) throws ClassNotFoundException {

        Person person = new Person();

        Class pClass3 = Class.forName("allClass.Person");       //동적 로딩(알아두면 좋음)
        System.out.println(pClass3.getName());

    }

}
