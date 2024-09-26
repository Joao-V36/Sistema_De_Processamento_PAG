package MetodPag;

public class PaymentProcessor{
    Order order;
    PaymentMethod payment;

    public PaymentProcessor(Order order, PaymentMethod payment) {
        this.order = order;
        this.payment = payment;
    }

    public void processOrderPayment(){
        if(payment.authorizePayment(order.getOrderAmount())){
            payment.processPayment(order.getOrderAmount());
        }else {
            System.out.println("Autorização do pagamento Falhou !!");
        }
    }
}
