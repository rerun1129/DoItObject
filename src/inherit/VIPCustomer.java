package inherit;

public class VIPCustomer extends Customer {

    private int agentID;
    private double discount;


    public VIPCustomer(int customerID, String customerName, int agentID) {
        super(customerID, customerName);
        this.agentID = agentID;
        customerGrade = "VIP";
        bonusRatio = 0.05;
        discount = 0.1;
    }

    public int getAgentID() {
        return agentID;
    }

    @Override
    public int calcPrice(int price) {

        super.calcPrice(price);

        return price - (int) (price * discount);

    }

    @Override
    public String showCustomerInfo() {
        return super.showCustomerInfo() + "담당 상담원 아이디는 " + agentID + "입니다.";
    }
}
