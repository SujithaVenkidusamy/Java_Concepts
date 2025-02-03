### SWITCH CASE

import java.util.Scanner;

public class VendingMachine {

    public static void coffee() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select your coffee option: ");
        System.out.println("1. Espresso Coffee");
        System.out.println("2. Cappuccino Coffee");
        System.out.println("3. Latte Coffee");
        int opt = scanner.nextInt();  // User enters a coffee option
        switch (opt) {
            case 1:
                System.out.println("Welcome to CCD!");
                System.out.println("Enjoy your Espresso Coffee!");
                break;
            case 2:
                System.out.println("Welcome to CCD!");
                System.out.println("Enjoy your Cappuccino Coffee!");
                break;
            case 3:
                System.out.println("Welcome to CCD!");
                System.out.println("Enjoy your Latte Coffee!");
                break;
            default:
                System.out.println("INVALID OPTION!");
                break;
        }
    }

    public static void tea() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select your tea option: ");
        System.out.println("1. Plain Tea");
        System.out.println("2. Assam Tea");
        System.out.println("3. Ginger Tea");
        System.out.println("4. Cardamom Tea");
        System.out.println("5. Masala Tea");
        System.out.println("6. Ginger Tea");
        System.out.println("7. Lemon Tea");
        System.out.println("8. Organic Darjeeling Tea");
        int opt = scanner.nextInt();  // User enters a tea option
        switch (opt) {
            case 1:
                System.out.println("Welcome to CCD!");
                System.out.println("Enjoy your Plain Tea!");
                break;
            case 2:
                System.out.println("Welcome to CCD!");
                System.out.println("Enjoy your Assam Tea!");
                break;
            case 3:
                System.out.println("Welcome to CCD!");
                System.out.println("Enjoy your Ginger Tea!");
                break;
            case 4:
                System.out.println("Welcome to CCD!");
                System.out.println("Enjoy your Cardamom Tea!");
                break;
            case 5:
                System.out.println("Welcome to CCD!");
                System.out.println("Enjoy your Masala Tea!");
                break;
            case 6:
                System.out.println("Welcome to CCD!");
                System.out.println("Enjoy your Ginger Tea!");
                break;
            case 7:
                System.out.println("Welcome to CCD!");
                System.out.println("Enjoy your Lemon Tea!");
                break;
            case 8:
                System.out.println("Welcome to CCD!");
                System.out.println("Enjoy your Organic Darjeeling Tea!");
                break;
            default:
                System.out.println("INVALID OPTION!");
                break;
        }
    }

    public static void soups() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select your soup option: ");
        System.out.println("1. Hot and Sour Soup");
        System.out.println("2. Veg Corn Soup");
        System.out.println("3. Tomato Soup");
        System.out.println("4. Spicy Tomato Soup");
        int opt = scanner.nextInt();  // User enters a soup option
        switch (opt) {
            case 1:
                System.out.println("Welcome to CCD!");
                System.out.println("Enjoy your Hot and Sour Soup!");
                break;
            case 2:
                System.out.println("Welcome to CCD!");
                System.out.println("Enjoy your Veg Corn Soup!");
                break;
            case 3:
                System.out.println("Welcome to CCD!");
                System.out.println("Enjoy your Tomato Soup!");
                break;
            case 4:
                System.out.println("Welcome to CCD!");
                System.out.println("Enjoy your Spicy Tomato Soup!");
                break;
            default:
                System.out.println("INVALID OPTION!");
                break;
        }
    }

    public static void beverages() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select your beverage option: ");
        System.out.println("1. Hot Chocolate");
        System.out.println("2. Badam Drink");
        System.out.println("3. Badam-Pista Drink");
        int opt = scanner.nextInt();  // User enters a beverage option
        switch (opt) {
            case 1:
                System.out.println("Welcome to CCD!");
                System.out.println("Enjoy your Hot Chocolate!");
                break;
            case 2:
                System.out.println("Welcome to CCD!");
                System.out.println("Enjoy your Badam Drink!");
                break;
            case 3:
                System.out.println("Welcome to CCD!");
                System.out.println("Enjoy your Badam-Pista Drink!");
                break;
            default:
                System.out.println("INVALID OPTION!");
                break;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first letter to select the main menu (c for coffee, t for tea, s for soups, b for beverages): ");
        char c = scanner.next().charAt(0);  // User enters main menu option

        switch (c) {
            case 'c':
                coffee();  // Call coffee method
                break;
            case 't':
                tea();  // Call tea method
                break;
            case 's':
                soups();  // Call soups method
                break;
            case 'b':
                beverages();  // Call beverages method
                break;
            default:
                System.out.println("INVALID OPTION");
                break;
        }
    }
}
