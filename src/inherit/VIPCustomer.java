package inherit;

public class VIPCustomer extends Customer{

    private int agentID;
    private double discount;


    public VIPCustomer(int customerID, String customerName) {
        super(customerID, customerName);
        customerGrade = "VIP";
        bonusRatio = 0.05;
        discount = 0.1;
    }

    public int getAgentID(){
        return agentID;
    }

    public int calcPrice(int price) {

        bonusPoint += price * bonusRatio;

        return price - (int)(price*discount);

    }
}
