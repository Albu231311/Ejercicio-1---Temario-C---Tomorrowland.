class Model {
    private int[] availableTickets = {20, 20, 20};
    private int[] ticketPrices = {400, 695, 2350};

    public int[] getAvailableTickets() {
        return availableTickets;
    }

    public int[] getTicketPrices() {
        return ticketPrices;
    }

    public void setAvailableTickets(int[] availableTickets) {
        this.availableTickets = availableTickets;
    }
}
