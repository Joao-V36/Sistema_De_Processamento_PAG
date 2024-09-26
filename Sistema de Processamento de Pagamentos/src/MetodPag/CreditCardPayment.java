package MetodPag;

public class CreditCardPayment implements PaymentMethod{
    private String numeroCartão;
    private String nomeImpresso;
    private String dataVencimento;
    private int cvv;

    public CreditCardPayment(String numeroCartão, String nomeImpresso, String dataVencimento, int cvv) {
        this.numeroCartão = numeroCartão;
        this.nomeImpresso = nomeImpresso;
        this.dataVencimento = dataVencimento;
        this.cvv = cvv;
    }
    @Override
    public boolean authorizePayment(double amount) {
        System.out.println("Pagamento cartao Autorizado ");
        return true;
    }

    @Override
   public void processPayment(double amount) {

        System.out.println("Processando Pagamento no cartao ... ");
    }

}
