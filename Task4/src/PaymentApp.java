public class PaymentApp {
    public static void main(String[] args) {

        PaymentGateway paypalAdapter = new PayPalAdapter(new PayPalGateway());
        PaymentGateway stripeAdapter = new StripeAdapter(new StripeGateway());
        PaymentGateway squareAdapter = new SquareAdapter(new SquareGateway());


        paypalAdapter.processPayment(100.0);
        stripeAdapter.processPayment(150.0);
        squareAdapter.processPayment(200.0);
    }
}