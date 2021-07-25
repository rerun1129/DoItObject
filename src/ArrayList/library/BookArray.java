package ArrayList.library;

public class BookArray {
    public static void main(String[] args) {
        Book[] library = new Book[5];           //현재 null인 상태임. 이대로 쓸수가 없음.
        //주소값은 다 다르다. 이제 여기에 각 배열마다
        //Book의 껍데기를 씌워줘야 한다.

        for (int i = 0; i < library.length; i++) {
            library[i] = new Book("이름없음", "무명"); //이렇게 만들면 됨

            System.out.println(library[i]);     //이렇게하면 해쉬코드만 나온다
            library[i].showBookInfo();          //이렇게 메서드를 쓰자
        }
    }
}
