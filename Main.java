import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            printMenu();
            System.out.print("Enter your choice: ");
            String choice = scanner.nextLine().trim();

            switch (choice) {
                case "1":
                    startNewGame();
                    break;
                case "2":
                    showInstructions();
                    break;
                case "3":
                    System.out.println("👋 Thanks for playing. Goodbye!");
                    running = false;
                    break;
                default:
                    System.out.println("❌ Invalid choice. Please enter 1, 2, or 3.");
            }

            System.out.println(); 
        }

        scanner.close();
    }

    private static void printMenu() {
        System.out.println("===============");
        System.out.println("🎮 HORROR CHASE");
        System.out.println("===============");
        System.out.println("1. Start New Game");
        System.out.println("2. How to Play");
        System.out.println("3. Exit");
    }

    private static void startNewGame() {
        System.out.println("🕹️ Starting new game...");
         new Game(); 
                  
    }

    private static void showInstructions() {
        System.out.println("📖 Instructions:");
        System.out.println("- You are in a haunted house.");
        System.out.println("- Each turn, you can move: (w)est, (a)west, (s)south, or (d)east.");
        System.out.println("- The enemy moves toward you after each turn.");
        System.out.println("- Find the exit before the enemy catches you!");
        System.out.println("- Beware! The enemy may move randomly sometimes.");
    }
}
