package inherit;

public class GoldCustomer extends Customer {


    private double discount;

    public GoldCustomer(int customerID, String customerName) {
        super(customerID, customerName);
        customerGrade = "Gold";
        bonusRatio = 0.02;
        discount = 0.1;

    }

    @Override
    public int calcPrice(int price) {
        super.calcPrice(price);
        return price - (int)(price*discount);
    }
}
