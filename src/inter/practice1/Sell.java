package inter.practice1;

public interface Sell {

    void sell();

    default void order() {
        System.out.println("판매주문");
    }

}
