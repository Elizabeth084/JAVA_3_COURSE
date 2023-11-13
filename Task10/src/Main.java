//Реализовать шаблон «Фасад» для систем управления авиабилетами, объединяющий функции поиска рейсов, выбора места и оплаты билета.
public class Main {
    public static void main(String[] args) {
        TicketBookingFacade ticketBookingFacade = new TicketBookingFacade();

        String from = "New York";
        String to = "Los Angeles";
        String date = "2023-11-30";
        int flightId = 122;
        int seatNumber = 6;
        double amount = 900.00;

        ticketBookingFacade.bookTicket(from, to, date, flightId, seatNumber, amount);
    }
}
