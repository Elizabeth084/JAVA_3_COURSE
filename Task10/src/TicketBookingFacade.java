class TicketBookingFacade {
    private FlightSearch flightSearch;
    private SeatSelection seatSelection;
    private TicketPayment ticketPayment;

    public TicketBookingFacade() {
        this.flightSearch = new FlightSearch();
        this.seatSelection = new SeatSelection();
        this.ticketPayment = new TicketPayment();
    }

    public void bookTicket(String from, String to, String date, int flightId, int seatNumber, double amount) {
        flightSearch.searchFlights(from, to, date);
        seatSelection.selectSeat(flightId, seatNumber);
        ticketPayment.makePayment(amount);
    }
}

