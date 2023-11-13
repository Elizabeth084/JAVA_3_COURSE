public class SquareAdapter implements PaymentGateway {
    private SquareGateway squareGateway;

    public SquareAdapter(SquareGateway squareGateway) {
        this.squareGateway = squareGateway;
    }
    @Override
    public void processPayment(double amount) {

        squareGateway.acceptPayment(amount);
    }
}