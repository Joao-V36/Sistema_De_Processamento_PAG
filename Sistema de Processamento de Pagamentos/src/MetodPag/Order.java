package MetodPag;

public class Order {
    private String orderId;
    private double orderAmount;

    public Order(String orderId , double orderAmount) {
        this.orderId = orderId;
        this.orderAmount = orderAmount;
    }

    public String getOrderId() {
        return orderId;
    }

    public double getOrderAmount() {
        return orderAmount;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public void setOrderAmount(double orderAmount) {

        this.orderAmount = orderAmount;
    }
}

