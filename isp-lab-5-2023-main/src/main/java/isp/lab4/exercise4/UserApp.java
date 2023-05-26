package isp.lab4.exercise4;

import java.util.List;

interface UserAppInterface {
    void buyTicket(String eventId, int numTickets);
    void viewTicket(String ticketId);
}
class UserApp implements UserAppInterface {
    private TicketManager ticketManager;

    public UserApp(TicketManager ticketManager) {
        this.ticketManager = ticketManager;
    }

    @Override
    public void buyTicket(String eventId, int numTickets) {
        List<String> ticketIds = ticketManager.generateTickets(eventId, numTickets);
        System.out.println(numTickets + " tickets purchased for event " + eventId + ". Ticket IDs: " + String.join(", ", ticketIds));
    }

    @Override
    public void viewTicket(String ticketId) {
        TicketStatus ticketStatus = ticketManager.validateTicket(ticketId);
        if (ticketStatus == TicketStatus.VALID) {
            System.out.println("Your ticket is: " + ticketId);
        } else {
            System.out.println("ERROR");
        }
    }
}
