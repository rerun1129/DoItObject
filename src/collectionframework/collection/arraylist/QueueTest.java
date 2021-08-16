package collectionframework.collection.arraylist;

import java.util.ArrayList;

class MyQueue {

    private static ArrayList<String> arrayQueue = new ArrayList<>();

    public void enQueue(String data) {
        arrayQueue.add(data);
    }

    public String deQueue() {
        String data = "";
        try {
            data = arrayQueue.remove(0);

        } catch (IndexOutOfBoundsException e) {
            System.out.println("큐가 비었습니다.");
        }
        return data;
    }



}


public class QueueTest {

    public static void main(String[] args) {

        MyQueue myQueue = new MyQueue();

        myQueue.enQueue("a");
        myQueue.enQueue("b");
        myQueue.enQueue("c");


        System.out.println(myQueue.deQueue());
        System.out.println(myQueue.deQueue());


    }

}
