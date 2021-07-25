package inherit;

public class CustomerTest {
    public static void main(String[] args) {
        Customer Lee = new Customer(10100,"리신");
        Customer Kim = new VIPCustomer(20100,"김환");



        System.out.println(Lee.calcPrice(10000));
        System.out.println(Kim.calcPrice(10000));
        System.out.println(Lee.showCustomerInfo());
        System.out.println(Kim.showCustomerInfo());

    }

}
