package collectionframework.collection.arraylist;

import java.util.ArrayList;

class MyStack {

    private static ArrayList<String> arrayStack = new ArrayList<>();

    public void push(String data) {
        arrayStack.add(data);
    }

    public String pop() {
        String data = "";
        try {
            data = arrayStack.remove(arrayStack.size() - 1);

        } catch (IndexOutOfBoundsException e) {
            System.out.println("스택이 비었습니다.");
        }
        return data;
    }
    public String peek() {
        String data = "";
        try {
            data = arrayStack.get(arrayStack.size() - 1);  //-1인 이유는 인덱스는 0,1,2,3 사이즈는 1,2,3

        } catch (IndexOutOfBoundsException e) {
            System.out.println("스택이 비었습니다.");
        }
        return data;
    }
}


public class StackTest {

    public static void main(String[] args) {

        MyStack myStack = new MyStack();

        myStack.push("a");
        myStack.push("b");
        myStack.push("c");


        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
        System.out.println(myStack.peek());
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());

    }

}
