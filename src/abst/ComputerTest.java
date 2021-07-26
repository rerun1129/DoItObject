package abst;

public class ComputerTest {


    public static void main(String[] args) {

        //Computer c1 = new Computer();       //추상 클래스는 인스턴스화가 불가능하다
        Computer c2 = new DeskTop();            //다형성을 이용해서 생성이 가능하다.
        //Computer c3 = new NoteBook();           //추상클래스->상속받은 추상클래스 또한 인스턴스화가 불가능하다.
        NoteBook c4 = new MyNoteBook();         //추상클래스->상속받은 추상클래스->상속받은 일반 클래스

    }
}
