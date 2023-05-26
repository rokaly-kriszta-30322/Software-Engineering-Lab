package isp.lab4.exercise4;

import java.util.ArrayList;
import java.util.List;

enum TicketStatus {
    VALID,
    INVALID
}

public class TicketManager {
    private List<String> ticketIds;

    public TicketManager() {
        ticketIds = new ArrayList<>();
    }

    public List<String> generateTickets(String eventId, int numTickets) {
        List<String> generatedTickets = new ArrayList<>();
        for (int i = 0; i < numTickets; i++) {
            String ticketId = eventId + "_ticket_" + (ticketIds.size() + 1);
            ticketIds.add(ticketId);
            generatedTickets.add(ticketId);
            System.out.println("Ticket generated: " + ticketId);
        }
        return generatedTickets;
    }

    public TicketStatus validateTicket(String ticketId) {
        if (ticketIds.contains(ticketId)) {
            return TicketStatus.VALID;
        } else {
            return TicketStatus.INVALID;
        }
    }
}

