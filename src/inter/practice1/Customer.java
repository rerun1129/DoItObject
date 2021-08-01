package inter.practice1;

public class Customer implements Buy,Sell{

    @Override
    public void buy() {

        System.out.println("구매하기");
    }

    @Override
    public void sell() {

        System.out.println("판매하기");
    }

    @Override
    public void order() {
        System.out.println("구매주문과 판매주문을 합니다.");
    }
}
