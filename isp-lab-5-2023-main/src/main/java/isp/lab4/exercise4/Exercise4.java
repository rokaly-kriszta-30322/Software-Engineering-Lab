package isp.lab4.exercise4;

public class Exercise4 {
    public static void main(String[] args) {
        TicketManager ticketManager = new TicketManager();
        UserApp userApp = new UserApp(ticketManager);
        OrganizerApp organizerApp = new OrganizerApp(ticketManager);

        userApp.buyTicket("event_1", 3);
        userApp.viewTicket("event_1_ticket_1");
        userApp.viewTicket("event_2_ticket_1");

        organizerApp.checkTickets("event_1_ticket_1");
        organizerApp.checkTickets("event_2_ticket_1");
    }
}

