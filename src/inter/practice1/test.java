package inter.practice1;

public class test {


    public static void main(String[] args) {
        Customer customer = new Customer();


        Buy buyer = customer;
        buyer.buy();

        Sell seller = customer;
        seller.sell();

        buyer.order();
        seller.order();

    }

}
