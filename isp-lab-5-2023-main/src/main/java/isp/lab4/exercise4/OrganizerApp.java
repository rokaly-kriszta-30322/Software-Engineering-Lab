package isp.lab4.exercise4;

interface OrganizerAppInterface {
    void checkTickets(String ticketId);
}
class OrganizerApp implements OrganizerAppInterface {
    private TicketManager ticketManager;

    public OrganizerApp(TicketManager ticketManager) {
        this.ticketManager = ticketManager;
    }

    @Override
    public void checkTickets(String ticketId) {
        TicketStatus ticketStatus = ticketManager.validateTicket(ticketId);
        if (ticketStatus == TicketStatus.VALID) {
            System.out.println("Ticket " + ticketId + " is valid.");
        } else {
            System.out.println("Ticket " + ticketId + " is invalid.");
        }
    }
}
