public class StripeAdapter implements PaymentGateway {
    private StripeGateway stripeGateway;

    public StripeAdapter(StripeGateway stripeGateway) {
        this.stripeGateway = stripeGateway;
    }

    @Override
    public void processPayment(double amount) {

        stripeGateway.completeTransaction(amount);
    }
}
