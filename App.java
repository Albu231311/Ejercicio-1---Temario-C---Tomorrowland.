


import java.util.Scanner;

public class App{
    public static void main(String[] args) {
        Model model = new Model();
        View view = new View();
        Controller controller = new Controller(model, view);
        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                System.out.print("Ingrese su nombre: ");
                String name = scanner.nextLine();
                System.out.print("Ingrese su DPI: ");
                String dpi = scanner.nextLine();
                System.out.print("Ingrese la cantidad de boletos que desea comprar: ");
                int quantity = scanner.nextInt();
                System.out.print("Ingrese su presupuesto máximo: ");
                int maxBudget = scanner.nextInt();
                scanner.nextLine();
                controller.requestTicket(name, dpi, quantity, maxBudget);
                System.out.print("¿Desea realizar otra compra? (s/n): ");
                String option = scanner.nextLine();
                if (option.equalsIgnoreCase("n")) {
                    break;
                }
            }
        }
    }
}




