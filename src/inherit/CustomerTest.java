package inherit;

import java.util.ArrayList;

public class CustomerTest {
    public static void main(String[] args) {

        ArrayList<Customer> customerList = new ArrayList<>();


        Customer Lee = new Customer(10100, "리신");
        Customer Kim = new VIPCustomer(20100, "김환", 12345);
        Customer Ko = new GoldCustomer(30100, "고윤석");

        customerList.add(Lee);
        customerList.add(Kim);
        customerList.add(Ko);

        System.out.println("=======================");

        for (Customer c : customerList) {
            System.out.println(c.showCustomerInfo());
        }
        int price = 10000;
        for (Customer c : customerList) {
            int cost = c.calcPrice(price);
            System.out.println(c.getCustomerName() + "님이 " + cost + "를 지불하셨습니다.");
        }
        for (Customer c : customerList) {
            System.out.println(c.showCustomerInfo());
        }
    }

}
