
import java.util.Random;
class Controller {
    private Model model;
    private View view;
    private Random rand = new Random();

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void requestTicket(String name, String dpi, int quantity, int maxBudget) {
        view.displayTicketRequestForm();
        int ticket = rand.nextInt(33000) + 1;
        int a = rand.nextInt(15000) + 1;
        int b = rand.nextInt(15000) + 1;
        if ((ticket + a + b) % 2 == 0) {
            int location = rand.nextInt(3);
            int[] availableTickets = model.getAvailableTickets();
            int[] ticketPrices = model.getTicketPrices();
            if (availableTickets[location] > 0 && ticketPrices[location] <= maxBudget) {
                int ticketsToBuy = Math.min(quantity, availableTickets[location]);
                availableTickets[location] -= ticketsToBuy;
                model.setAvailableTickets(availableTickets);
                view.displayTicketPurchaseResult(name + " ha comprado " + ticketsToBuy + " boletos para la localidad " + (location + 1));
            } else {
                view.displayTicketPurchaseResult(name + " no pudo comprar boletos");
            }
        } else {
            view.displayTicketPurchaseResult(name + " no pudo comprar boletos");
        }
    }
}
