public class TextEditor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = "Hello friends, I'm Sharanya from third year in the department of Artificial Intelligence and data science"; // Initial text

        while (true) {
            System.out.println("\n Current Text: " + text);
            System.out.println("\nChoose any operations ");
            System.out.println("1. Replace Text ");
            System.out.println("2. ReplaceAll ");
            System.out.println("3. Check If Text Matches Pattern");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    // Replace a specific substring with another
                    System.out.print("\nEnter the text to replace: ");
                    String oldText = sc.nextLine();
                    System.out.print("Enter the new text: ");
                    String newText = sc.nextLine();
                    text = text.replace(oldText, newText);
                    System.out.println("Text after replacement: " + text);
                    break;

                case 2:
                    // Replace using a regular expression
                    System.out.print("\nEnter the pattern to replace: ");
                    String regex = sc.nextLine();
                    System.out.print("Enter the replacement text: ");
                    String replacement = sc.nextLine();
                    text = text.replaceAll(regex, replacement);
                    System.out.println("Text after regex replacement: " + text);
                    break;

                case 3:
                    // Check if text matches pattern
                    System.out.print("\nEnter regex pattern to check: ");
                    String pattern = sc.nextLine();
                    if (text.matches(pattern)) {
                        System.out.println("The text matches the pattern.");
                    } else {
                        System.out.println("The text does NOT match the pattern.");
                    }
                    break;

                case 4:
                    // Exit the program
                    System.out.println("Exiting the text editor. Goodbye!");
                   
                    return;

                default:
                    System.out.println("Invalid choice! Please try again.");
                    break;
            }
        }
    }
}
