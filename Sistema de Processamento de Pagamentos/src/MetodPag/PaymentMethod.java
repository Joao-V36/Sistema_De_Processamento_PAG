package MetodPag;

public interface PaymentMethod {

     boolean authorizePayment(double amount);

    void processPayment(double amount);



}

