package MetodPag;

public class main {
    public static void main(String[] args) {
        Order order = new Order("blusa" , 100.50);

        PaymentMethod creditcard = new CreditCardPayment("1234-4567-7890-0978", "JOAO VICTOR", "12/25", 157);
        PaymentProcessor processor = new PaymentProcessor(order, creditcard);
        processor.processOrderPayment();

        PaymentMethod pix = new PixPayment("31973139778");
        processor = new PaymentProcessor(order,pix);
        processor.processOrderPayment();

    }
}
