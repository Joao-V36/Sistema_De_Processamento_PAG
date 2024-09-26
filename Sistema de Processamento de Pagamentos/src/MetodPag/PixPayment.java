package MetodPag;

public class PixPayment implements PaymentMethod{
    private String chavePix;

    public PixPayment(String chavePix) {

        this.chavePix = chavePix;
    }

    @Override
   public boolean authorizePayment(double amount) {
        System.out.println("Pagamento PIX Autorizado ");
        return true;
    }

   @Override
   public void processPayment(double amount) {

        System.out.println("Processando Pagamento PIX... ");
    }
}
