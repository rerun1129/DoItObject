package lambda;

public class TestStringConcat {

    public static void main(String[] args) {
        StringConcatImp stringConcatImp = new StringConcatImp();

        stringConcatImp.makeString("헬로", "자바");

        StringConcat concat = ((s1, s2) -> System.out.println(s1 + " " + s2));

        concat.makeString("헬로", "자바");

        StringConcat concat1 = new StringConcat() {
            @Override
            public void makeString(String s1, String s2) {
                System.out.println(s1 + " " + s2);
            }
        };

        concat1.makeString("헬로", "자바");

    }

}
