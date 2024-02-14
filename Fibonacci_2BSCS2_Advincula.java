import java.util.Scanner;

public class Fibonacci_2BSCS2_Advincula {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            printMenu();
            char choice = getUserChoice(scanner);
            
            if (choice == 'A') {
                generateNonrecursiveFibonacci(scanner);
            } else if (choice == 'B') {
                generateRecursiveFibonacci(scanner);
            } else if (choice == 'C') {
                break;
            } else {
                System.out.println("Invalid choice. Please try again.");
            }
        }
        
        printProgrammerName();
        scanner.close();
    }
    
    public static void printMenu() {
        System.out.println("Select an option:");
        System.out.println("A. Generate Fibonacci sequence recursivelynon-recursively");
        System.out.println("B. Generate Fibonacci sequence non-recursively");
        System.out.println("C. Exit");
    }
    
    public static char getUserChoice(Scanner scanner) {
        System.out.print("Enter your choice: ");
        return scanner.next().charAt(0);
    }
    
    public static void generateNonrecursiveFibonacci(Scanner scanner) {
        System.out.print("Enter number of terms: ");
        int terms = scanner.nextInt();
        int first = 0, second = 1;
        
        for (int i = 0; i < terms; i++) {
            System.out.print(first + ", ");
            int next = first + second;
            first = second;
            second = next;
        }
        System.out.println();
    }
    
    public static void generateRecursiveFibonacci(Scanner scanner) {
        System.out.print("Enter number of terms: ");
        int terms = scanner.nextInt();
        
        for (int i = 0; i < terms; i++) {
            System.out.print(fibonacci(i) + ", ");
        }
        System.out.println();
    }
    
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
    
    public static void printProgrammerName() {
        System.out.println("Programmer's Name: Ysac Advincula");
    }
}
